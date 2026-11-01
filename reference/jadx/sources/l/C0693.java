package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.֡᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: O8BF */
/* JADX INFO: loaded from: classes3.dex */
public class C0693 extends AbstractC0656 {

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2948 = 0;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f2951;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public C13479 f2952 = new C13479();

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C16943 f2950 = new C16943();

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public boolean f2949 = true;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C14600 mo3078() {
        return C1362.f5713;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence mo3080() {
        if (m41573("streamMode")) {
            return C16737.m39264(R.string.MT_Protector, m41567("targetPath"));
        }
        return this.f2949 ? C16737.m39264(R.string.MT_Protector, C16737.m39288(R.string.MT_Protector).toLowerCase()) : C16737.m39264(R.string.MT_Protector, m41567("targetPath"));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo2982("...");
        if (m41573("streamMode")) {
            return;
        }
        m2977(m41565("ARG_MSG_FROM"), C16737.m39288(R.string.MT_Protector).toLowerCase());
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C5202 mo3077() throws Exception {
        AbstractC9677 abstractC9677;
        String[] strArrM41566 = m41566("ARG_PATHS");
        String strM41585 = m41585("targetPath");
        AbstractC12233 abstractC12233 = (AbstractC12233) m41560();
        AbstractC12233 abstractC12234 = (AbstractC12233) m41574();
        boolean zM41573 = m41573("streamMode");
        if (zM41573) {
            abstractC9677 = abstractC12233;
        } else {
            AbstractC20745 abstractC20745M46688 = C11904.f39941.m46688("");
            this.f2951 = abstractC20745M46688;
            abstractC20745M46688.m46739();
            this.f2952.m32986(abstractC12233, abstractC12234, strM41585, strArrM41566, this.f2951.mo33986(), new C21155(this));
            if (mo2357()) {
                return C5202.m14378();
            }
            m41591(R.string.MT_Protector);
            mo2982("...");
            m2974(false);
            m2977(C16737.m39288(R.string.MT_Protector).toLowerCase(), m41565("ARG_MSG_TO"));
            C7813 c7813 = new C7813(this.f2952.m32984());
            strArrM41566 = (String[]) C9030.stream(c7813.mo10263("/", true)).map(new C4355(2)).toArray(new C7750());
            this.f2950.m39671(new C16217(this));
            abstractC9677 = c7813;
        }
        C20450 c20450 = new C20450(this, zM41573);
        this.f2950.m39670(abstractC9677, abstractC12234, strArrM41566, strM41585, c20450);
        return m41583();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380() && m41579(c11545)) {
            c11545.m28831();
        }
        List listM39669 = this.f2950.m39669();
        if (listM39669.isEmpty() || !m41559(c11546)) {
            return;
        }
        c11546.m28777((Collection) listM39669);
        c11546.m28830();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo3079(C5202 c5202) {
        AbstractC20745 abstractC20745 = this.f2951;
        if (abstractC20745 != null) {
            abstractC20745.mo24647();
        }
        C21094.m47530();
        AbstractC12233 abstractC12233M39672 = this.f2950.m39672();
        if (abstractC12233M39672 != null) {
            C21094.m47529(abstractC12233M39672.mo10276());
        }
    }
}
