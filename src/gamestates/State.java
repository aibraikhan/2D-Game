package src.gamestates;

import java.awt.event.MouseEvent;

import src.audio.AudioPlayer;
import src.main.Game;
import src.ui.MenuButton;

public class State {

    protected Game game;
    public State(Game game) {
        this.game = game;
    }

    public boolean isIn(MouseEvent e, MenuButton mb) {
        return mb.getBounds().contains(e.getX(), e.getY());
    }

    public Game getGame() {
        return game;
    }

    public void setGameState(Gamestate state) {
        switch (state) {
            case MENU -> game.getAudioPlayer().playSong(AudioPlayer.MENU_1);
            case PLAYING -> game.getAudioPlayer().setLevelSong(game.getPlaying().getLevelManager().getLvlIndex());
        }
        Gamestate.state = state;
    }
}
