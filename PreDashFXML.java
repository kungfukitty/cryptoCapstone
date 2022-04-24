package cryptoCapstone;

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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class PreDashFXML {

    Stage stage;
    Scene scene;
    Parent root;
    @FXML
    private Button loan;

    @FXML
    private Button dao;

    @FXML
    private Button donation;

    @FXML
    private Button training;

    @FXML
    private Button exitApp;

    @FXML
    private Button dash;

    @FXML
    private TextArea display;

    @FXML
    void daoDisplay(ActionEvent event) {
        display.setText("	  	 	 	 	 	 	Presented by "
                +                                                      "Wyoming Secretary of State \n" +
"Business Division \n" +
"Ph. 307.777.7311 \n" +
"Email: Business@wyo.gov \n" +
" \n" +
" \n" +
"Decentralized Autonomous Organization (DAO): Frequently Asked Questions \n" +
" \n" +
"Amended statutory provisions regulating DAOs became effective March 9, 2022.  \n" +
"Click here to find 2022 Senate Enrolled Act No. 16. \n" +
"●	How do I form a DAO? \n" +
"○ A DAO can be formed either online or by mailing the paper form. \n" +
"○ For online filers: \n" +
"■ Begin by selecting the business entity type of Limited Liability Company. \n" +
"■ During step 1, select Decentralized Autonomous Organization as the Additional Designation from the drop-down list (this drop-down is located under the business entity name fields). \n" +
"■ During step 6, follow the instructions on the screen specific for DAOs.  The following information is statutorily required to appear in the Articles of Organization if you have elected to be a DAO: \n" +
"●	Pursuant to W.S. 17-31-106(a), a statement that the entity is a decentralized autonomous organization.  \n" +
"●	Pursuant to W.S. 17-31-106(b), a publicly available identifier of any smart contract directly used to manage, facilitate, or operate the DAO (If a public identifier is not provided in the articles, the DAO has thirty (30) calendar days from the date filed with the Secretary of State to provide it through an amendment to the articles.  If not provided in thirty (30) calendar days, the DAO will be dissolved.). \n" +
"●	Pursuant to W.S. 17-31-104(c), a Notice of Restrictions on Duties and Transfers if it will not appear in the operating agreement; and \n" +
"●	If the Notice of Restrictions on Duties and Transfers appears or will appear in the operating agreement, a statement of such. \n" +
"●	Pursuant to W.S. 17-31-104(e), a statement establishing how the DAO shall be managed by the members, including to what extent the management will be conducted algorithmically. \n" +
"■ To file online, visit https://wyobiz.wyo.gov/Business/RegistrationInstr.aspx ○ 	For paper filers: \n" +
"■ Mail in the Articles of Organization – DAO form with a check or money order.  Visit our forms page: https://sos.wyo.gov/Forms/default.aspx ● Are there any special naming requirements? \n" +
"○ The name must include “DAO LLC” or a combination of the entity indicators for both DAO and LLC as follow:   \n" +
"■ The name must include specifically, “DAO”, or “LAO.” (W.S. 17-31-104(d)). \n" +
" \n" +
" \n" +
"Herschel Building East, Suite 101 	 	 	 	 	 	       Revised 03.09.2022 \n" +
"122 W 25th Street 	 	 	 	 	 	 	 	 	   307-777-7311  \n" +
"Cheyenne, WY 82002-0020 	 	 	 	 	 	 	        business@wyo.gov \n" +
"	  	 	 	 	 	 	Wyoming Secretary of State \n" +
"Business Division \n" +
"Ph. 307.777.7311 \n" +
"Email: Business@wyo.gov \n" +
" \n" +
" DAO: FAQ (continued) \n" +
" \n" +
"■ The name must include the words “Limited Liability Company,” or its abbreviations \n" +
"“LLC,” “L.L.C.,” “Limited Company,” “LC,” “L.C.,” “Ltd. Liability Company,” \n" +
"“Ltd. Liability Co.,” or “Limited Liability Co.” (W.S. 17-29-108) \n" +
"●	How much does it cost to form a DAO? \n" +
"○	The initial filing fee is $100. \n" +
"■ An annual report is due every year thereafter; the fee for which is a minimum of $60.  The fee is calculated based on all assets located and employed in Wyoming. The tax is $60 or two-tenths of one mill on the dollar ($.0002), whichever is greater.  \n" +
"●	Do I have to live in Wyoming to register a DAO? \n" +
"○	No. You can register a DAO regardless of where you reside, but you must have a Wyoming registered agent who meets the statutory requirements (W.S. 17-28-101 through W.S. 17-28111). \n" +
"●	Does a DAO have to have a registered agent? \n" +
"○	Yes, just as all other LLCs, you must have a registered agent to register a DAO. For more information on registered agents: https://sos.wyo.gov/Business/CRAHome.aspx ● If I currently have an LLC registered, can I convert it to a DAO? If so, how? \n" +
"○ Yes, you can convert an existing domestic LLC to a DAO. \n" +
"■ You will need to file an amendment to your articles.  The amendment must contain information as required in W.S. 17-31-104(b): https://sos.wyo.gov/Forms/default.aspx \n" +
"●	Can I register my out-of-state DAO? \n" +
"○	No. A certificate of authority for a foreign DAO cannot be filed pursuant to W.S. 17-31-116. \n" +
"●	How does a DAO differ from a regular LLC? \n" +
"○	Unlike a standard LLC which is managed by human members/managers, a DAO can be managed by a combination of human members/managers and algorithmically.  \n" +
"●	What is a smart contract? \n" +
"○	A smart contact is an automated transaction, as defined in W.S. 40‑21‑102(a)(ii), or any substantially similar analogue, which is comprised of code, script or programming language that executes the terms of an agreement and which may include taking custody of and transferring an asset, administrating membership interest votes with respect to a decentralized autonomous organization or issuing executable instructions for these actions, based on the occurrence or nonoccurrence of specified conditions (W.S. 17-31-102 (a)(ix)). \n" +
"●	Where can I find more information on DAOs? \n" +
"○	You can review the legislation for DAOs here: \n" +
"https://wyoleg.gov/2021/Enroll/SF0038.pdf \n" +
"○ For more information on Automated Transaction and the Uniform Electronic Transactions Act: \n" +
"https://wyoleg.gov/NXT/gateway.dll?f=templates&fn=default.htm \n" +
"Herschel Building East, Suite 101 	 	 	 	 	 	       Revised 03.09.2022 \n" +
"122 W 25th Street 	 	 	 	 	 	 	 	 	   307-777-7311  \n" +
"Cheyenne, WY 82002-0020 	 	 	 	 	 	 	        business@wyo.gov ");
    }

    @FXML
    void donation(ActionEvent event) {
        display.setText("			\n" +
"Ways to Accept Crypto Donations (Easiest to Hardest)\n" +
"\n" +
"Intermediary 501(c)(3)\n" +
"By accepting cryptocurrency through another 501(c)(3), including donor advised funds (DAFs), nonprofits don't have to take custody of crypto. This greatly simplifies the legal, accounting, and administrative implications of accepting the asset. These intermediaries handle the tax receipts and conversion, then grant out to organizations in cash.\n" +
"While DAFs are only available to donors who hold an account, registered 501(c)(3) public charities can generate a donate button and get started for free using Every.org. As a nonprofit, Every.org does not charge any fees and handles compliance — including filing IRS Form 8282 and accounting — then sends U.S. dollars to nonprofits.\n" +
"Since regulations around cryptocurrencies are in flux, this approach is suitable for nonprofits that wish to remain high-level with cryptocurrencies but still offer it as an option for donors.\n" +
" Specialized Nonprofit Crypto Processors\n" +
"Payment processors such as The Giving Block and Engiven help nonprofits accept donations to their own wallet, allowing them to hold onto crypto as an investment if they wish. For a service fee, these companies handle transactional aspects like automatic conversion to cash and tax receipts and may assist with crafting marketing campaigns to the crypto community.\n" +
"Since the nonprofit takes custody of the crypto, it will be important to handle compliance with IRS regulations and accounting best practices. If holding, the nonprofit should consider the volatility of the assets and set policies around when to liquidate.\n" +
"This approach is suitable for nonprofits that want to make cryptocurrency a core aspect of their development or assets and want a built-out donation widget with automated receipts.\n" +
"Checkout Through Crypto Exchange\n" +
"Exchanges like BitPay and Coinbase offer embeddable checkout experiences with automatic conversion to cash for minimal fees. However, since these are generalized consumer experiences and not specifically created with donations in mind, nonprofits will need to handle donor support, tax receipts, and collection of donor information.\n" +
"This approach is suitable for nonprofits that want minimal fees, and still want an embeddable widget, but don't mind handling the administrative and operational work themselves\n" +
"Wallet\n" +
"A \"wallet\" is a place where you can receive, send, and store crypto. This is the most technical of the options, and there are many types of wallets to explore — custodial or noncustodial, hardware or software. \n" +
"The most important consideration will be to securely store and create policies for accessing the credentials. It will also be important to keep clear records of transactions since there will be no donor information associated with transactions.\n" +
"\n" +
""
        );
    }

    @FXML
    void exitApp(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void loandisplay(ActionEvent event) {
        display.setText("Flash Loans"
                + "What is a Flash Loan?\n"
                + "Flash loans are a feature designed for developers,"
                + " due to the technical knowledge required "
                + "to execute one. Flash Loans allow you to borrow any available "
                + "amount of assets without putting up any collateral, as long as the"
                + " liquidity is returned to the protocol within one block transaction. "
                + "To do a Flash Loan, you will need to build a contract that requests a Flash Loan. "
                + "The contract will then need to execute the instructed steps and pay back the loan + interest"
                + " and fees all within the same transaction"
                + "Flash Loans\n"
                + "Flash Loans are special transactions that allow the borrowing of an asset, as long as the borrowed "
                + "amount (and a fee) is returned before the end of the transaction (also called One Block Borrows). "
                + "These transactions do not require a user to supply collateral prior to engaging in the transaction."
                + " There is no real world analogy to Flash Loans, so it requires some basic understanding of how state "
                + "is managed within blocks in blockchains.\n"
                + "Flash Loans are an advanced concept aimed at developers. You must have a good understanding of EVM,"
                + " programming, and smart contracts to be able to use this feature.\n"
                + "Overview\n"
                + "Flash-loan allows users to access liquidity of the pool (only for reserves for which borrow is enabled) "
                + "for one transaction as long as the amount taken plus fee is returned or (if allowed) debt position is "
                + "opened by the end of the transaction.\n"
                + "Aave V3 offers two options for flash loans:\n"
                + "​: Allows borrower to access liquidity of multiple reserves in single flashLoan transaction. The borrower "
                + "also has an option to open stable or variabled rate debt position backed by supplied collateral or credit "
                + "delegation in this case.\n" + "NOTE: flash loan fee is waived for approved flashBorrowers (managed by )\n"
                + "​:  Allows borrower to access liquidity of single reserve for the transaction. In this case flash loan fee "
                + "is not waived nor can borrower open any debt position at the end of the transaction. This method is gas"
                + " efficient for those trying take advantage of simple flash loan with single reserve asset.\n"
                + "Execution Flow\n" + "For developers, a helpful mental model to consider when developing your solution:\n"
                + "Your contract calls the Pool contract, requesting a Flash Loan of a certain amount(s) of reserve(s) using  or .\n"
                + "After some sanity checks, the Pool transfers the requested amounts of the reserves to your contract, then calls "
                + "executeOperation() on receiver contract .\n"
                + "Your contract, now holding the flash loaned amount(s), executes any arbitrary operation in its code. \n"
                + "If you are performing a flashLoanSimple, then when your code has finished, you approve Pool for flash loaned amount + fee.\n"
                + "If you are performing flashLoan, then for all the reserves either depending on  interestRateMode passed for the asset, either the"
                + " Pool must be approved for flash loaned amount + fee or must or sufficient collateral or credit delegation should be available to open "
                + "debt position.\n"
                + "If the amount owing is not available (due to a lack of balance or approvaln or insufficient collateral for debt), then the"
                + " transaction is reverted.\n"
                + "All of the above happens in 1 transaction (hence in a single ethereum block).\n"
                + "​\n"
                + "Applications of Flash Loans\n"
                + "Aave Flash Loans are already used with Aave V3 for liquidity swap feature. Other examples in the wild include:\n"
                + "Arbitrage between assets, without needing to have the principal amount to execute the arbitrage.\n"
                + "Liquidating borrow positions, without having to repay the debt of the positions and using discounted collateral claimed "
                + "to payoff flashLoan amount + fee.\n"
                + "Flash loan fee\n"
                + "The flash loan fee is initialized at deployment to 0.09% and can be updated via Governance Vote. Use  to get current value.\n"
                + "Flashloan fee can be shared by the LPs (liquidity providers) and the protocol treasury. The FLASHLOAN_PREMIUM_TOTAL represents "
                + "the total fee paid by the borrowers of which:\n"
                + "Fee to LP: FLASHLOAN_PREMIUM_TOTAL - FLASHLOAN_PREMIUM_TO_PROTOCOL\n"
                + "Fee to Protocol: FLASHLOAN_PREMIUM_TO_PROTOCOL\n"
                + "At initialization, FLASHLOAN_PREMIUM_TO_PROTOCOL is set to 0.\n"
                + "Step by step\n"
                + "1. Setting Up\n"
                + "Your contract that receives the flash loaned amounts must conform to the  or  interface by implementing the relevant executeOperation()"
                + " function.\n"
                + "Also note that since the owed amounts will be pulled from your contract, your contract must give allowance to the Pool to pull those"
                + " funds to pay back the flash loan amount + premiums.\n"
                + "2. Calling flashLoan() or flashLoanSimple()\n"
                + "To call either of the two flash loan methods on the Pool, we need to pass in the relevant parameters. There are 3 ways you can do"
                + " this.\n"
                + "From an EOA ('normal' ethereum account)\n"
                + "To use an EOA, send a transaction to the relevant Pool calling the flashLoan() or flashLoanSimple() function. See  for parameter "
                + "details, ensuring you use your contract address from  for the receiverAddress.\n"
                + "\n"
                + "From a different contract\n"
                + "Similar to sending a transaction from an EOA as above, ensure the receiverAddress is your contract address from .\n"
                + "\n"
                + "From the same contract\n"
                + "If you want to use the same contract as in step 1, use address(this) for the receiverAddress parameter in the flash loan method.\n"
                + "Never keep funds permanently on your FlashLoanReceiverBase contract as they could be exposed to a , where the stored funds are used "
                + "by an attacker.\n"
                + "Completing the flash loan\n"
                + "Once you have performed your logic with the flash loaned assets (in your executeOperation() function), you will need to pay back the "
                + "flash loaned amounts if you used flashLoanSimple() or interestRateMode=0 in flashLoan()for any of the assets in modes parameter.\n"
                + "Paying back a flash loaned asset\n"
                + "Ensure your contract has the relevant amount + premium to payback the borrowed asset. You can calculate this by taking the sum of the "
                + "relevant entry in the amounts and premiums array passed into the executeOperation() function.\n"
                + "\n"
                + "You do not need to transfer the owed amount back to the Pool. The funds will be automatically pulled at the conclusion of your"
                + " operation.\n"
                + "Incurring a debt (i.e. not immediately paying back)\n"
                + "If you initially used a mode=1 or mode=2 for any of the assets in the modes parameter, then the address passed in for onBehalfOf"
                + " will incur the debt if the onBehalfOf address has previously approved the msg.sender to incur debts on their behalf.\n"
                + "This means that you can have some assets that are paid back immediately, while other assets incur a debt."
        );

    }

    @FXML
    void returntoDash(ActionEvent event) {
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
    void trainingDisplay(ActionEvent event) {
        display.setText("Bulls on Crypto Street\n" +
"Who it’s for: Investors looking to diversify into the Metaverse, Crypto & NFTs\n" +
"Price: $798\n" +
"Bulls on Crypto Street is a trading bootcamp with several offerings, ranging from\n" +
" a free course to an all-encompassing paid bootcamp. The bootcamp teaches\n" +
" investors how to successfully trade digital assets ranging from NFTs and the \n" +
"metaverse to DeFi cryptocurrencies. You can join the intro to crypto trading\n" +
" course for free, and the discord channel will notify you of trade alerts.\n" +
"Coinbase Learn\n" +
"Coinbase Learn is a comprehensive educational platform that\n" +
" aims to explain the concepts of digital currencies and blockchains.\n" +
" Hosted by Coinbase, a popular cryptocurrency exchange, Coinbase\n" +
"Learn allows first-time crypto holders and veterans alike to brush up\n" +
"on their technical knowledge and explore how the underlying technologies work.\n" +
"Cointelegraph\n" +
"Cointelegraph is an independent digital media platform that specializes in blockchain\n" +
" technology, cryptocurrencies, and emerging FinTech trends. Aiming to \n" +
"deliver impartial and unbiased news, analytics, and insights—Cointelegraph\n" +
" delivers daily articles and news from both the centralized and decentralized worlds.\n" +
"Ivan on Tech\n" +
"Ivan on Tech describes itself as the leading online university for studying blockchain \n" +
"and cryptocurrency topics. It aims to make the skills required for blockchain development\n" +
" and programming accessible, offering over 30 courses to allow crypto holders to\n" +
" strengthen their knowledge of topics like DeFi, smart contract development, and\n" +
" technical analysis. Ivan on Tech also runs a popular YouTube channel and \n" +
"regular live streams to discuss the latest crypto news and industry updates,\n" +
"and in-depth market analyses.\n" +
"\n" +
"\n" +
"");
    }

}
