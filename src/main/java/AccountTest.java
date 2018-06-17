import com.alibaba.fastjson.JSONObject;
import org.web3j.crypto.CipherException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.ArrayList;
import java.util.List;

public class  AccountTest {

    private static String ip = "http://localhost:8545/";

    public static void main(String args[]) throws CipherException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException, IOException {
//        AccountTest accountTest = new AccountTest();
//        accountTest.createAccount();|
        Account account = new Account();
//       account.createAccountByWeb3j("D:/ethAddress/","liuxiujiang");
        account.getAccounts();
//    file("D:/ethAddress");

    }

}