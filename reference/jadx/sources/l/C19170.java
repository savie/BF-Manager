package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19170 extends AbstractC19357 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f61911;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f61912;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C21825 f61913 = C21825.m48588();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f61914;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19670 f61915;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8587 f61916;

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1264(AbstractC8774 abstractC8774) {
        this.f61911 = this.f61916.f29693.f44893.f14261;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1262(C3107 c3107) {
        if (!c3107.f30190.m39001(EnumC6617.ERROR)) {
            this.f61911 = c3107.f30190;
        } else {
            this.f61911 = m44002(c3107.f11715, this.f61915.f63141).f77449;
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268(C23570 c23570) {
        if (!c23570.f30190.m39001(EnumC6617.ERROR)) {
            this.f61911 = c23570.f30190;
            return;
        }
        boolean z = this.f61912;
        try {
            this.f61912 = false;
            c23570.f76357.mo1802(this);
            AbstractC16579 abstractC16579 = this.f61911;
            this.f61912 = z;
            this.f61911 = m44002(c23570.f76356, abstractC16579.f53222).f77449;
        } catch (Throwable th) {
            this.f61912 = z;
            throw th;
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3937(C11596 c11596) {
        if (!c11596.f30190.m39001(EnumC6617.ERROR)) {
            this.f61911 = c11596.f30190;
            return;
        }
        c11596.f38963.mo1802(this);
        C0309 c0309 = (C0309) this.f61911;
        if (this.f61913.contains(c0309.f53222)) {
            C22492 c22492 = (C22492) c0309.f53222;
            int iM48596 = c11596.f38962.m48596();
            C13609 c13609 = this.f61916.f29693;
            C0309 c03010 = (C0309) c22492.f77449;
            C6171.m17176(c03010.f1655.isEmpty());
            if (iM48596 == 1) {
                AbstractC6302 abstractC6302 = c13609.f44901.f77631;
                abstractC6302.getClass();
                char[] charArray = "T".toCharArray();
                c03010.f1655 = c03010.f1655.m48597(new C22929(c22492, c13609.f44893.f14228, abstractC6302.mo17390(charArray, charArray.length)));
            } else {
                while (iM48596 > 0) {
                    c03010.f1655 = c03010.f1655.m48597(new C22929(c22492, c13609.f44893.f14228, c13609.f44901.f77631.m17389(C8479.m22141(iM48596, "T"))));
                    iM48596--;
                }
            }
        }
        C21825 c21825 = c11596.f38962;
        C19003 c19003 = new C19003();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            ((AbstractC8774) it.next()).mo1802(this);
            c19003.m43723(this.f61911);
        }
        this.f61911 = new C18464(c0309.f53222, c11596.f30190, c19003.m43726());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22492 m44002(AbstractC11242 abstractC11242, AbstractC23903 abstractC23903) {
        C22492 c22492 = new C22492(this.f61912 ? 512 : 0, abstractC11242, abstractC23903);
        c22492.f73417 = new C0993(c22492);
        c22492.f77449 = new C7881(this.f61914, c22492);
        this.f61913 = this.f61913.m48597(c22492);
        return c22492;
    }

    public C19170(AbstractC8587 abstractC8587, C19670 c19670, AbstractC16579 abstractC16579, boolean z) {
        this.f61916 = abstractC8587;
        this.f61915 = c19670;
        this.f61914 = abstractC16579;
        this.f61912 = z;
    }
}
