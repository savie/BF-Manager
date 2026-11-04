package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1UG */
/* JADX INFO: loaded from: classes3.dex */
public final class C5853 extends AbstractC21976 implements InterfaceC11621 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22261 f20088;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC20769 f20089;

    public C5853(AbstractC20769 abstractC20769, C22261 c22261) {
        this.f20089 = abstractC20769;
        this.f20088 = c22261;
    }

    @Override // l.AbstractC21976
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17037(AbstractC0500 abstractC0500) {
        String strMo22086;
        String strM35295 = abstractC0500.m35295();
        if (C13923.m33909(strM35295)) {
            return;
        }
        C22261 c22261 = this.f20088;
        AbstractC5107 abstractC5107 = C14143.f44726;
        Map map = (Map) c22261.get(abstractC5107);
        if (map == null) {
            map = new HashMap();
            c22261.put(abstractC5107, map);
        }
        if (m17036(abstractC0500) == null) {
            AbstractC20769 abstractC20769 = this.f20089;
            abstractC20769.mo22088();
            do {
                strMo22086 = abstractC20769.mo22086();
            } while (map.containsKey(strMo22086));
            map.put(strMo22086, strM35295);
            C11818.m29667(abstractC0500).mo13503(strMo22086);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m17036(AbstractC0500 abstractC0500) {
        return (String) C11818.m29667(abstractC0500).mo13501();
    }
}
