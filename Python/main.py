import pygame
import time
import random

WIDTH, HEIGHT = 1000,800
WIN= pygame.display.set_mode((WIDTH,HEIGHT))
pygame.display.set_caption("xxx")

BG = pygame.transform.scale(pygame.image.load("Python\wp5356608-aesthetic-forest-hd-wallpapers.jpg"),(WIDTH,HEIGHT))

def draw():
    WIN.blit(BG,(0,0))
    pygame.display.update(200, HEIGHT - PLAYER_HEIGHT,PLAYER_WIDTH, player_height)
 
def main():
    run = True
    player= pygame.Rect()

    while run:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                run = False
                break
    
    pygame.quit()

if __name__ == "__main__":
    main()