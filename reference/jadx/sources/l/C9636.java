package l;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Properties;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.ۡ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class C9636 extends AbstractC7730 implements InterfaceC14441 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f31154;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2925 f31155;

    @Override // l.InterfaceC14441
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Properties mo25147(InterfaceC14441 interfaceC14441, InterfaceC24139 interfaceC24139) {
        C9636 c9636 = (C9636) interfaceC14441;
        Properties properties = new Properties();
        properties.put("style", ((EnumC18587) interfaceC24139).f60379);
        StringBuilder sb = new StringBuilder();
        Iterator it = ((C18499) this.f21176).iterator();
        String str = "";
        while (it.hasNext()) {
            for (AbstractC22664 abstractC22664 : ((C8274) this.f31155.f9584.f29052.m8710((AbstractC22664) it.next())).m22332(EnumC0816.values())) {
                if (abstractC22664.m51073(C14769.m35539((Iterable) c9636.f21176))) {
                    sb.append(str);
                    sb.append(abstractC22664);
                    str = ",";
                }
            }
        }
        properties.put(AnnotatedPrivateKey.LABEL, "\"" + sb.toString() + "\"");
        return properties;
    }

    public C9636(C2925 c2925, AbstractC22664 abstractC22664) {
        this.f31155 = c2925;
        C18499 c18499 = new C18499();
        c18499.m43089(abstractC22664);
        super(c18499);
        this.f31154 = new LinkedHashSet();
    }

    @Override // l.AbstractC6239
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC24139[] mo17870() {
        return new InterfaceC24139[]{EnumC18587.BOUND};
    }

    @Override // l.AbstractC7730
    /* JADX INFO: renamed from: ᩴ */
    public final Iterable mo21015() {
        return this.f31154;
    }

    @Override // l.AbstractC6239
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo17868(InterfaceC24139 interfaceC24139) {
        if (interfaceC24139 == EnumC18587.BOUND) {
            return this.f31154;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final HashSet m25148() {
        HashSet hashSet = new HashSet();
        m25145(hashSet);
        return hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25145(HashSet hashSet) {
        if (hashSet.add(this)) {
            Iterator it = this.f31154.iterator();
            while (it.hasNext()) {
                ((C9636) it.next()).m25145(hashSet);
            }
        }
    }

    @Override // l.InterfaceC14441
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Properties mo25146() {
        Properties properties = new Properties();
        properties.put(AnnotatedPrivateKey.LABEL, "\"" + this.f21176.toString() + "\"");
        return properties;
    }
}
