
public class Test_Blockchain {

    public static void main(String args[]) {

        Blockchain tcpCoin = new Blockchain();

        Block c = new Block("0x200", new java.util.Date(), "<transactions>");
        Block d = new Block("0x200", new java.util.Date(), "<transactions>");
        Block f = new Block("0x200", new java.util.Date(), "<transactions>");

        tcpCoin.addBlock(c);
        tcpCoin.addBlock(d);
        tcpCoin.addBlock(f);

    
        tcpCoin.displayChain();

        tcpCoin.isValid();

    }

}
