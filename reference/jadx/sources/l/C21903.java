package l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩸᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21903 implements Supplier {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71068;

    public /* synthetic */ C21903(int i) {
        this.f71068 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f71068) {
            case 0:
                return ServiceC8498.f29453;
            default:
                char[] cArr = C22253.f72746;
                try {
                    return MessageDigest.getInstance("SHA-384");
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
