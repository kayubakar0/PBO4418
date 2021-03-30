public class App {
    public static void main(String[] args) throws Exception {
        GamePlayer player=new GamePlayer();
        player.setDimension(12,12);
        player.setPotition(10,220);
        System.out.println("Posisi Player: "+player.getx()+","+player.gety());
        player.run(12);
        System.out.println("Posisi Player: "+player.getx()+","+player.gety());
        
        GamePlayer kawan=new GamePlayer();
        kawan.setDimension(12,32);
        kawan.setPotition(10,10);
        
        GameEnemy musuh=new GameEnemy();
        musuh.setDimension(12,32);
        musuh.setPotition(10,10);
        
        GameEnviroment scene = new GameEnviroment();
        scene.addPlayer(player);
        scene.addPlayer(player);
        scene.addPlayer(kawan);
        scene.getAllPlayers();
        scene.removePlayer(player);
        scene.getAllPlayers();
        scene.addEnemy(musuh);
        scene.interaction();
    }
}
