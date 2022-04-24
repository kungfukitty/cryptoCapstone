package cryptoCapstone;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author Bey
 */
public class Vocab {

    @FXML
    private TextArea displayTf;

    @FXML
    Button exitBtn;
    @FXML
    private Button display;
    @FXML
    private Button dash;
    Stage stage;
    Scene scene;
    Parent root;
    @FXML
    private Label label1;

    @FXML
    void vocabDisplay(ActionEvent event) throws FileNotFoundException {
        displayTf.setText(" A Short Introduction to the World of Cryptocurrencies\n" +
"\n" +
" INTRODUCTION\n" +
"Bitcoin originated with the white paper that was published in 2008 under the pseudonym “Satoshi Nakamoto.” It was published via a mailing list for cryptography and has a similar appearance to an academic paper. The creators’ original motivation behind Bitcoin was to develop a cash-like payment system that permitted electronic transactions but that also included many of the advantageous characteristics of physical cash. To understand the specific features of physical monetary units and the desire to develop digital cash, we will begin our analysis by considering a simple cash transaction.\n" +
"Cash\n" +
"Cash is represented by a physical object, usually a coin or a note. When this object is handed to another individual, its unit of value is also transferred, without the need for a third party to be involved. No credit relationship arises between the buyer and the seller. \n" +
"Therefore, it is possible for the parties involved to remain anonymous. \n" +
"The great advantage of physical cash is that whoever is in possession of the physical object is by default the owner of the unit of value. This ensures that the property rights to the of value circulating in the economy are always clearly established, without a central authority needing to keep accounts. Furthermore, any agent can participate in a cash payment system; nobody can be excluded. There is a permissionless access to it. Cash, however, also has disadvantages. Buyers and sellers must be physically present at the same location in order to trade, which in many situations makes its use impracticable.\n" +
"\n" +
"Digital Cash\n" +
"An ideal payment system would be one in which monetary value could be transferred electronically via cash data files (Figure 2). Such cash data files retain the advantages of physical cash but would be able to circulate freely on electronic networks.1 A data file of this type could be sent via email or social media channels. \n" +
"A specific feature of electronic data is that it can be copied any number of times at negligible cost. This feature is highly undesirable for money. If cash data files can be copied and the duplicates used as currency, they cannot serve as a payment instrument. This problem is termed the “double spending problem.”\n" +
"\n" +
"Electronic Payment Systems\n" +
"To counteract the problem of double spending, classical electronic payment systems are based on a central authority that verifies the legitimacy of the payments and keeps track of the current state of ownership. In such systems, a central authority (usually a bank) manages the accounts of buyers and sellers. The buyer initiates a payment by submitting an order. The central authority then ensures that the buyer has the necessary funds and adjusts the accounts accordingly.\n" +
"Centralized payment systems solve the double spending problem, but they require trust. Agents must trust that the central authority does not misuse the delegated power and that it maintains the books correctly in any state of the world—that is, that the banker is not running away with the money. Furthermore, centralized systems are vulnerable to hacker attacks, technical failures, and malicious governments that can easily interfere and confiscate funds.\n" +
"\n" +
"Stone Money of Yap\n" +
"The key feature of the Bitcoin system is the absence of a centrally managed ledger. There is no central authority with an exclusive right to keep accounts. To understand how this is possible, we will first discuss a historical payment system that has certain similarities with the Bitcoin system. \n" +
"On Yap Island, large millstone-like stones were used as a medium of exchange. The stones were quarried almost 280 miles away on the island of Palau and brought to Yap by small boats. Every inhabitant could bring new stone money units into the system. The money creation costs, in the form of labor effort and equipment such as boats, protected the economy from inflation.\n" +
"Instead of having to laboriously move the stones, which are up to 13 feet in diameter, with every transaction from a buyer’s front yard to a seller’s front yard, the ownership rights were transferred virtually. A stone remained at its original location, and the unit of value could be detached from it and circulated irrespective of the stone’s whereabouts. It was sufficient that all the inhabitants knew who the owner of every stone was. The separation between the unit of value and the stone went so far that even the unit of value for stones that were lost at sea remained in circulation. The stone money of Yap can therefore be described as a quasi- virtual currency, as each unit of value was only loosely linked to a physical object.\n" +
"\n" +
"in 2009; and, at the time of this writing, block #494600 was appended as the most recent block to the chain. Because everyone can download and read the Bitcoin Blockchain, it is a public record, a ledger that contains Bitcoin ownership information for any point in time. \n" +
"The word “ledger” has to be qualified here. There is no single instance of the Bitcoin Blockchain. Instead, every participant is free to manage his or her own copy of the ledger. As it was with the stone money, there is no central authority with an exclusive right to keep accounts. Instead, there is a predefined set of rules and the opportunity for individuals to monitor that other participants adhere to the rules. The notion of “public record of ownership” also must be qualified because the owners of Bitcoin units usually remain anonymous through the use of pseudonyms.\n" +
"To use the Bitcoin system, an agent downloads a Bitcoin wallet. A Bitcoin wallet is software that allows the receiving, storing, and sending of (fractions of) Bitcoin units.3 The next step is to exchange fiat currencies, such as the U.S. dollar, for Bitcoin units. The most common way is to open an account at one of the many Bitcoin exchanges and to transfer fiat currency to it. The account holder can then use these funds to buy Bitcoin units or one of the many other cryptoassets on the exchange. Due to the widespread adoption of Bitcoin, the pricing on large exchanges is very competitive with relatively small bid-ask spreads. Most exchanges provide order books and many other financial tools that make the trading process transparent.\n" +
"A Bitcoin transaction works in a way that is similar to a transaction in the Yap payment system. A buyer broadcasts to the network that a seller’s Bitcoin address is the new owner of a specific Bitcoin unit. This information is distributed on the network until all nodes are informed about the ownership transfer. We will examine some technical details of this step in Section 2.     \n" +
"For a virtual currency to function, it is crucial to establish at every point in time how many monetary units exist, as well as how many new units have been created. There must also be a consensus mechanism that ensures that all participants agree about the ownership rights to the virtual currency units. In small communities, as with the Yap islanders, everyone knows everyone else. The participants care about their reputation, and conflicts can be disputed directly. In contrast, within the Bitcoin system the number of participants is substantially larger, and network participants can remain anonymous. Consequently, reputation effects cannot be expected to have a significant positive impact, and coordination becomes very difficult. Instead, there is a consensus mechanism that allows the Bitcoin system to reach an agreement. This consensus mechanism is the core innovation of the Bitcoin system and allows consensus to be reached on a larger scale and in the absence of any personal relations.\n" +
"\n" +
"Bitcoin Mining\n" +
"To understand the consensus mechanism of the Bitcoin system, we first must discuss the role of a miner. A miner collects pending Bitcoin transactions, verifies their legitimacy, and assembles them into what is known as a “block candidate.” The goal is to earn newly created Bitcoin units through this activity. The miner can succeed in doing this if he or she can convince all other network participants to add his or her block candidate to their copies of the Bitcoin Blockchain\n" +
"Bitcoin mining is permissionless. Anyone can become a miner by downloading the respective software and the most recent copy of the Bitcoin Blockchain. In practice, however, there are a few large miners that produce most of the new generally accepted blocks. The reason is that competition has become fierce and only large mining farms with highly specialized hardware and access to cheap electricity can still make a profit from mining. \n" +
"For a block candidate to be generally accepted, it must fulfill a specific set of predefined criteria. For instance, all included transactions must be legitimate. Another important criterion is the so-called “fingerprint” of the block candidate. A miner obtains this fingerprint by computing the block candidate’s hash value using the hash function dSHA256. \n" +
"For example, we will look at the hash value for the text, “Federal Reserve Bank of Saint Louis.” The fingerprint of this text, which was calculated using the hash function dSHA256, is 72641707ba7c9be334f111ef5238f4a0b355481796fdddfdaac4c5f2320eea68.\n" +
"Now notice the small change in the original text to “federal Reserve Bank of Saint Louis.” It will cause an unpredictable change of the fingerprint, which can be seen from the corresponding new hash value:  \n" +
"423f5dd7246de6faf8b839c41bf46d303014cffa65724ab008431514e36c4dba.\n" +
"As suggested by this example, a data file’s hash value cannot be prognosticated.\n" +
"This characteristic is employed in the mining process as follows. For a block candidate to be accepted by all miners, its fingerprint must possess an extremely rare feature: The hash value must be below a certain threshold value—that is, it must display several zeroes at the beginning of the fingerprint. An example of a fingerprint of a block that was added to the Bitcoin Blockchain in 2010 is given in the following example:\n" +
"                 Block #69785 (July 23rd, 2010, 12:09:36 CET)\n" +
"0000000000293b78a2833b45d78e97625f 6484ddd1accbe0067c2b8f 98b57995\n" +
"	 	Needtobezero\n" +
"Miners are continuously trying to find block candidates that have a hash value satisfying the above-mentioned criterion. For this purpose, a block includes a data field (called the nonce) that contains arbitrary data. Miners modify this arbitrary data to gain a new fingerprint. These modifications do not affect the set of included transactions. Just as with our example, every modification result in a new hash value. Most of the time, the hash value lies above the threshold value, and the miner discards the block candidate. If, however, a miner succeeds in creating a block candidate with a hash value below the current threshold value, he or she broadcasts the block candidate as quickly as possible to the network. All the other network participants can then easily verify that the fingerprint satisfies the threshold criterion by computing it themselves.\n" +
"\n" +
"Consensus Mechanism\n" +
"The consensus among miners is that every miner who receives a block candidate with a valid fingerprint adds it to his or her own copy of the Bitcoin Blockchain. From a game theoretical perspective, a strategy profile where all miners add valid blocks to their own copies of the Bitcoin Blockchain is a Nash equilibrium. If a miner believes that all other miners are acting accordingly, then it is a best response for that miner to add a valid block candidate to his or her own copy of the Bitcoin Blockchain. A deviation is not worthwhile, because it is not profitable to work on a version of the Bitcoin Blockchain that is not generally accepted. Any reward for finding blocks on a version of the chain that is not accepted by anyone else is worthless. Thus, although there is no authority enforcing this rule and miners are free to modify their copy of the Blockchain as they wish, there is a strong incentive to follow this rule. This self-enforcing rule allows the network to maintain consensus about the ownership of all \n" +
"Bitcoin units \n" +
"Mining is expensive, as the computations use large amounts of electricity and are increasingly dependent on highly specialized hardware. Moreover, valid block candidates can be found only through a trial-and-error procedure. The consensus mechanism is therefore called “proof of work.” If a miner finds a valid fingerprint for a block candidate, then this is proof that he or she has, on average, performed many costly computations. Adding false information (e.g., illegitimate transactions) to a block candidate would render the block candidate invalid and essentially waste all the computations. Finding a valid fingerprint is therefore proof that the miner helped to maintain the Bitcoin system.   \n" +
"\n" +
"Monetary Policy\n" +
"Every payment system needs rules that regulate how new monetary units are produced (or destroyed). The Bitcoin network is calibrated in such a way that, on average, a block candidate with a valid hash value is found every 10 minutes. The winner of the mining contest receives a predefined number of newly created Bitcoin units. The number currently is 12.5.\n" +
"In the Bitcoin system, money creation is scheduled so that the number of Bitcoin units will converge to 21 million units. This limit exists because the reward for the miners is halved every 210,000 blocks (approximately every four years). Correspondingly, miners will be increasingly rewarded through transaction fees. But even today, the quick processing of a transaction can be guaranteed only if an adequate fee is paid to incentivize the miners to include the transaction in their block candidates. \n" +
"Most Bitcoin users believe that Bitcoin’s limited supply will result in deflation. That is, they are convinced that its value will forever increase. Indeed, up to this point we have witnessed a spectacular price increase from essentially a value of $0 for one Bitcoin unit in 2009 to a value of $7,000 at the time of this writing (Figure 6). \n" +
"Nonetheless, these beliefs need to be challenged. Bitcoin units have no intrinsic value. Because of this, the present price of the currency is determined solely by expectations about its future price. A buyer is willing to buy a Bitcoin unit only if he or she assumes that the unit will sell for at least the same price later. The price of Bitcoin, therefore, reacts highly elastically to changes in the expectations of market participants and is reflected in extreme price volatility. From monetary theory, we know that currencies with no intrinsic value have many equilibrium prices.5 One of them is always zero. If all market participants expect that Bitcoin will have no value in the future, then no one is willing to pay anything for it today.\n" +
"However, Bitcoin is not the only currency that has no intrinsic value. State monopoly currencies, such as the U.S. dollar, the euro, and the Swiss franc, have no intrinsic value either. They are fiat currencies created by government decree. The history of state monopoly currencies is a history of wild price swings and failures. This is why decentralized cryptocurrencies are a welcome addition to the existing currency system.\n" +
"");
    }

    @FXML
    void returnDash(ActionEvent event) {

        dash.setOnAction(actionEvent -> {
            try {
                root = FXMLLoader.load(getClass().getResource("DashboardFXML.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Login");
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        });

    }

    @FXML
    void ExitApp(ActionEvent event) {

        System.exit(0);
    }

}
