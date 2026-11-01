package l;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Properties;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.۠᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class C8506 extends AbstractC19315 implements InterfaceC21431 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19795 f29479;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f29480;

    @Override // l.InterfaceC21431
    /* JADX INFO: renamed from: ۙ */
    public final Properties mo12538(InterfaceC21431 interfaceC21431, InterfaceC22843 interfaceC22843) {
        C8506 c8506 = (C8506) interfaceC21431;
        Properties properties = new Properties();
        properties.put("style", ((EnumC7094) interfaceC22843).f23775);
        StringBuilder sb = new StringBuilder();
        Iterator it = ((C19003) this.f22269).iterator();
        String str = "";
        while (it.hasNext()) {
            for (AbstractC16579 abstractC16579 : ((C10229) this.f29479.f63563.f31302.m44602((AbstractC16579) it.next())).m26012(EnumC8112.values())) {
                if (abstractC16579.m39005(C21825.m48583((Iterable) c8506.f22269))) {
                    sb.append(str);
                    sb.append(abstractC16579);
                    str = ",";
                }
            }
        }
        properties.put(AnnotatedPrivateKey.LABEL, "\"" + sb.toString() + "\"");
        return properties;
    }

    public C8506(C19795 c19795, AbstractC16579 abstractC16579) {
        this.f29479 = c19795;
        C19003 c19003 = new C19003();
        c19003.m43723(abstractC16579);
        super(c19003);
        this.f29480 = new LinkedHashSet();
    }

    @Override // l.AbstractC6614
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC22843[] mo3681() {
        return new InterfaceC22843[]{EnumC7094.BOUND};
    }

    @Override // l.AbstractC19315
    /* JADX INFO: renamed from: ۚ */
    public final Iterable mo3680() {
        return this.f29480;
    }

    @Override // l.AbstractC6614
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo3679(InterfaceC22843 interfaceC22843) {
        if (interfaceC22843 == EnumC7094.BOUND) {
            return this.f29480;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final HashSet m22235() {
        HashSet hashSet = new HashSet();
        m22234(hashSet);
        return hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22234(HashSet hashSet) {
        if (hashSet.add(this)) {
            Iterator it = this.f29480.iterator();
            while (it.hasNext()) {
                ((C8506) it.next()).m22234(hashSet);
            }
        }
    }

    @Override // l.InterfaceC21431
    /* JADX INFO: renamed from: ۙ */
    public final Properties mo5805() {
        Properties properties = new Properties();
        properties.put(AnnotatedPrivateKey.LABEL, "\"" + this.f22269.toString() + "\"");
        return properties;
    }
}
