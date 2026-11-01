package l;

import java.io.IOException;
import java.util.TimerTask;

/* JADX INFO: renamed from: l.ۙ᩺۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V9VI */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4955 extends TimerTask {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22823 f17302;

    /* JADX INFO: renamed from: ܰ */
    public abstract String mo4999();

    public AbstractC4955(C22823 c22823) {
        this.f17302 = c22823;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22823 m13745() {
        return this.f17302;
    }

    public String toString() {
        return mo4999();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22034 m13742(C22034 c22034, C18506 c18506) throws IOException {
        try {
            c22034.m48942(c18506);
            return c22034;
        } catch (IOException unused) {
            int iM6980 = c22034.m6980();
            boolean zM6975 = c22034.m6975();
            int iM48948 = c22034.m48948();
            int iM6974 = c22034.m6974();
            c22034.m6977(iM6980 | 512);
            c22034.m6983(iM6974);
            this.f17302.m50547(c22034);
            C22034 c22035 = new C22034(iM6980, iM48948, zM6975);
            c22035.m48942(c18506);
            return c22035;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22034 m13741(C22034 c22034, C13568 c13568, AbstractC19918 abstractC19918) throws IOException {
        try {
            c22034.m48941(c13568, abstractC19918);
            return c22034;
        } catch (IOException unused) {
            int iM6980 = c22034.m6980();
            boolean zM6975 = c22034.m6975();
            int iM48948 = c22034.m48948();
            int iM6974 = c22034.m6974();
            c22034.m6977(iM6980 | 512);
            c22034.m6983(iM6974);
            this.f17302.m50547(c22034);
            C22034 c22035 = new C22034(iM6980, iM48948, zM6975);
            c22035.m48941(c13568, abstractC19918);
            return c22035;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22034 m13744(C22034 c22034, AbstractC19918 abstractC19918, long j) throws IOException {
        try {
            c22034.m48944(abstractC19918, j);
            return c22034;
        } catch (IOException unused) {
            int iM6980 = c22034.m6980();
            boolean zM6975 = c22034.m6975();
            int iM48948 = c22034.m48948();
            int iM6974 = c22034.m6974();
            c22034.m6977(iM6980 | 512);
            c22034.m6983(iM6974);
            this.f17302.m50547(c22034);
            C22034 c22035 = new C22034(iM6980, iM48948, zM6975);
            c22035.m48944(abstractC19918, j);
            return c22035;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22034 m13743(C22034 c22034, AbstractC19918 abstractC19918) throws IOException {
        try {
            c22034.m48943(abstractC19918);
            return c22034;
        } catch (IOException unused) {
            int iM6980 = c22034.m6980();
            boolean zM6975 = c22034.m6975();
            int iM48948 = c22034.m48948();
            int iM6974 = c22034.m6974();
            c22034.m6977(iM6980 | 512);
            c22034.m6983(iM6974);
            this.f17302.m50547(c22034);
            C22034 c22035 = new C22034(iM6980, iM48948, zM6975);
            c22035.m48943(abstractC19918);
            return c22035;
        }
    }
}
