package l;

import android.media.MediaDrmResetException;
import java.util.function.BiFunction;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.᩷ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: NJN */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21764 implements InterfaceC15670, InterfaceC19795, InterfaceC25138, InterfaceC11711 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49330(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + aSN1ObjectIdentifier;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m49332(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    @Override // l.InterfaceC11711
    /* JADX INFO: renamed from: ۙ */
    public Object mo14221(Object obj, Throwable th) {
        return th;
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    @Override // l.InterfaceC15670
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC13433 mo3996() {
        return new C9703();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m49333(InterfaceC19526 interfaceC19526, Object obj, BiFunction biFunction) {
        C17359.requireNonNull(biFunction);
        Object obj2 = interfaceC19526.get(obj);
        if (obj2 == null && !interfaceC19526.containsKey(obj)) {
            return null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply == null) {
            interfaceC19526.remove(obj);
            return null;
        }
        interfaceC19526.put(obj, objApply);
        return objApply;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m49329(InterfaceC19526 interfaceC19526, Object obj, BiFunction biFunction) {
        C17359.requireNonNull(biFunction);
        Object obj2 = interfaceC19526.get(obj);
        boolean z = obj2 != null || interfaceC19526.containsKey(obj);
        if (!z) {
            obj2 = null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply != null) {
            interfaceC19526.put(obj, objApply);
            return objApply;
        }
        if (z) {
            interfaceC19526.remove(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m49328(InterfaceC19526 interfaceC19526, Object obj, Object obj2, BiFunction biFunction) {
        C17359.requireNonNull(biFunction);
        C17359.requireNonNull(obj2);
        Object obj3 = interfaceC19526.get(obj);
        if ((obj3 != null || interfaceC19526.containsKey(obj)) && (obj2 = biFunction.apply(obj3, obj2)) == null) {
            interfaceC19526.remove(obj);
            return null;
        }
        interfaceC19526.put(obj, obj2);
        return obj2;
    }

    @Override // l.InterfaceC25138
    public Object apply(Object obj) {
        ((Throwable) obj).getClass();
        return null;
    }
}
