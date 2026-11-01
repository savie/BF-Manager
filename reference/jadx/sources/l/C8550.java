package l;

import java.io.IOException;
import java.lang.reflect.Constructor;
import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: renamed from: l.ۡ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4W4 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8550 implements InterfaceC11955, InterfaceC21333, InterfaceC19782 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22297(ASN1Sequence aSN1Sequence, StringBuilder sb) {
        sb.append(aSN1Sequence.size());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22299(int i) {
        if (i >= 0 && i <= 8) {
            return true;
        }
        if (i < 16 || i > 18) {
            return i >= 28 && i <= 31;
        }
        return true;
    }

    @Override // l.InterfaceC19782
    public void accept(Object obj) throws IOException {
        throw ((IOException) obj);
    }

    @Override // l.InterfaceC11955
    public Object apply(Object obj) {
        return ((InterfaceC10045) obj).mo2755().getClass().getSimpleName();
    }

    @Override // l.InterfaceC21333
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Constructor mo22300() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC10045.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
