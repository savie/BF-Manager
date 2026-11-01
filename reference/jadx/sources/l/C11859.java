package l;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAQH */
/* JADX INFO: loaded from: classes3.dex */
public final class C11859 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C10157 f39788 = new C10157(1000);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f39789;

    static {
        AbstractC20745 abstractC20745M46690 = C11904.f39938.m46690("encoding");
        f39789 = abstractC20745M46690;
        if (abstractC20745M46690.mo33975()) {
            try {
                C17367 c17367M40441 = C17367.m40441(abstractC20745M46690.m46727());
                int iM40462 = c17367M40441.m40462();
                for (int i = 0; i < iM40462; i++) {
                    f39788.m25801(c17367M40441.m40458(), c17367M40441.m40458());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29554(String str, String str2) {
        C10157 c10157 = f39788;
        c10157.m25801(str, str2);
        C11018 c11018 = new C11018();
        LinkedHashMap linkedHashMapM25802 = c10157.m25802();
        c11018.mo24508(linkedHashMapM25802.size());
        for (Map.Entry entry : linkedHashMapM25802.entrySet()) {
            c11018.m27786((String) entry.getKey());
            c11018.m27786((String) entry.getValue());
        }
        AbstractC20745 abstractC20745 = f39789;
        synchronized (abstractC20745) {
            try {
                abstractC20745.m46703(c11018.m27789());
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29552(int i, byte[] bArr) {
        if (i == 0) {
            return null;
        }
        MessageDigest messageDigestM49416 = C22253.m49416();
        messageDigestM49416.update(bArr, 0, i);
        return (String) f39788.m25800(C22253.m49424(messageDigestM49416.digest()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29553(String str, int i, byte[] bArr) {
        if (i != 0) {
            MessageDigest messageDigestM49416 = C22253.m49416();
            messageDigestM49416.update(bArr, 0, i);
            m29554(C22253.m49424(messageDigestM49416.digest()), str);
        }
    }
}
