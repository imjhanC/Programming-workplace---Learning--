let speedValue = 0;
let totalDistance = 0;
let startTime = 0;
let previousTime = 0;
let averageSpeedValue = 0;

function updateSpeed(speed) {
    document.getElementById('speedValue').textContent = speed.toFixed(2);
}

function updateAverageSpeed(distance, time) {
    const averageSpeed = (distance / (time / 3600)) || 0;
    document.getElementById('averageSpeedValue').textContent = averageSpeed.toFixed(2);
}

function updateOdometer(distance) {
    totalDistance += distance;
    document.getElementById('odometerValue').textContent = totalDistance.toFixed(2);
}

function updateTime() {
    const currentTime = new Date().toLocaleTimeString();
    document.getElementById('timeValue').textContent = currentTime;
}

if ("geolocation" in navigator) {
    navigator.geolocation.watchPosition(function(position) {
        const speed = position.coords.speed || 0;
        const currentTime = Date.now();

        if (startTime === 0) {
            startTime = currentTime;
        } else {
            const deltaTime = (currentTime - previousTime) / 1000; // Convert to seconds
            updateAverageSpeed(totalDistance, currentTime - startTime);
            updateOdometer(speed * deltaTime / 3600);
        }

        updateSpeed(speed);
        previousTime = currentTime;
        updateTime();
        setInterval(updateTime, 1000);
    });
}
