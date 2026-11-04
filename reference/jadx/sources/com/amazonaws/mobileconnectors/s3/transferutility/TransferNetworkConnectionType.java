package com.amazonaws.mobileconnectors.s3.transferutility;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.HashMap;
import java.util.Map;
import l.InterfaceC3397;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '᩶' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public abstract class TransferNetworkConnectionType {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Map f283;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    @InterfaceC3397("MOBILE")
    public static final TransferNetworkConnectionType f284;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ TransferNetworkConnectionType[] f285;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Log f286;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    @InterfaceC3397("WIFI")
    public static final TransferNetworkConnectionType f287;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    @InterfaceC3397("ANY")
    public static final TransferNetworkConnectionType f288;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo372(NetworkInfo networkInfo);

    public TransferNetworkConnectionType(String str, int i) {
        super(str, i);
    }

    public static TransferNetworkConnectionType valueOf(String str) {
        return (TransferNetworkConnectionType) Enum.valueOf(TransferNetworkConnectionType.class, str);
    }

    public static TransferNetworkConnectionType[] values() {
        return (TransferNetworkConnectionType[]) f285.clone();
    }

    static {
        int i = 0;
        TransferNetworkConnectionType transferNetworkConnectionType = new TransferNetworkConnectionType("ANY", i) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType.1
            @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType
            /* JADX INFO: renamed from: ۙ */
            public boolean mo372(NetworkInfo networkInfo) {
                return networkInfo != null && networkInfo.isConnected();
            }
        };
        f288 = transferNetworkConnectionType;
        TransferNetworkConnectionType transferNetworkConnectionType2 = new TransferNetworkConnectionType("WIFI", 1) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType.2
            @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType
            /* JADX INFO: renamed from: ۙ */
            public boolean mo372(NetworkInfo networkInfo) {
                return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 1;
            }
        };
        f287 = transferNetworkConnectionType2;
        TransferNetworkConnectionType transferNetworkConnectionType3 = new TransferNetworkConnectionType("MOBILE", 2) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType.3
            @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType
            /* JADX INFO: renamed from: ۙ */
            public boolean mo372(NetworkInfo networkInfo) {
                return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 0;
            }
        };
        f284 = transferNetworkConnectionType3;
        f285 = new TransferNetworkConnectionType[]{transferNetworkConnectionType, transferNetworkConnectionType2, transferNetworkConnectionType3};
        f283 = new HashMap();
        TransferNetworkConnectionType[] transferNetworkConnectionTypeArrValues = values();
        int length = transferNetworkConnectionTypeArrValues.length;
        while (i < length) {
            TransferNetworkConnectionType transferNetworkConnectionType4 = transferNetworkConnectionTypeArrValues[i];
            f283.put(transferNetworkConnectionType4.toString(), transferNetworkConnectionType4);
            i++;
        }
        f286 = LogFactory.m296(TransferNetworkConnectionType.class);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m371(ConnectivityManager connectivityManager) {
        return mo372(connectivityManager.getActiveNetworkInfo());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static TransferNetworkConnectionType m370(String str) {
        Map map = f283;
        if (map.containsKey(str)) {
            return (TransferNetworkConnectionType) map.get(str);
        }
        f286.mo285("Unknown connection type " + str + " transfer will have connection type set to ANY.");
        return f288;
    }
}
