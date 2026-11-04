package l;

import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۚܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BK */
/* JADX INFO: loaded from: classes3.dex */
public class C5762 extends C5653 {

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public boolean f19810;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private synchronized void m16836(C12187 c12187) {
        try {
            if (this.f19810) {
                return;
            }
            this.f19810 = true;
            String strM43865 = m43865("remoteTaskId");
            C21949 c21949M49661 = C21949.m49661();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(C8284.m22375(m43865("sourcePath")));
            linkedHashSet.add(C8284.m22375(m43865("targetPath")));
            ArrayList arrayList = new ArrayList(linkedHashSet);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it = m16835().iterator();
            while (it.hasNext()) {
                linkedHashSet2.add(C8284.m22375((String) it.next()));
            }
            ArrayList arrayList2 = new ArrayList(linkedHashSet2);
            List list = Collections.EMPTY_LIST;
            c21949M49661.m49668(strM43865, this, c12187, arrayList, arrayList2, list, c12187.m30474() ? m16835() : list);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // l.C5653, l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 mo16840() {
        return null;
    }

    @Override // l.C5653, l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        String strM43865 = m43865("remoteTaskId");
        C21949 c21949M49661 = C21949.m49661();
        C25154 c25154 = new C25154(strM43865, c21949M49661, m43867("replacedName") != null);
        this.f19522 = c25154;
        c21949M49661.m49669(strM43865, this, c25154);
        super.mo2528();
        c21949M49661.m49667(strM43865, this);
    }

    @Override // l.C5653, l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws Exception {
        C12187 c12187Mo2531 = super.mo2531();
        m16836(c12187Mo2531);
        return c12187Mo2531;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo16837(String str) {
        super.mo16837(str);
        C21949.m49661().m49667(m43865("remoteTaskId"), this);
    }

    @Override // l.AbstractC15118
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo16841(CharSequence charSequence) {
        super.mo16841(charSequence);
        C21949.m49661().m49667(m43865("remoteTaskId"), this);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo16839(int i) {
        super.mo16839(i);
        C21949.m49661().m49667(m43865("remoteTaskId"), this);
    }

    @Override // l.AbstractC15118
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo16842(C1858 c1858) {
        super.mo16842(c1858);
        C21949.m49661().m49667(m43865("remoteTaskId"), this);
    }

    @Override // l.AbstractC15118
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo16838(long j) {
        super.mo16838(j);
        C21949.m49661().m49667(m43865("remoteTaskId"), this);
    }

    @Override // l.C5653, l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        super.mo2533(c12187);
        m16836(c12187);
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    private List m16835() {
        if (this.f19529 == null) {
            return Collections.EMPTY_LIST;
        }
        String strM22375 = C8284.m22375(m43865("targetPath"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : m43831("ARG_PATHS")) {
            linkedHashSet.add(str);
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (AbstractC6662 abstractC6662 : this.f19529.m14079()) {
            if (linkedHashSet.contains(abstractC6662.m18604()) && abstractC6662.m18620() != null) {
                String strM28549 = C11293.m28549(strM22375, String.valueOf(abstractC6662.m18620()));
                if (abstractC6662.m18625()) {
                    strM28549 = C14483.m34972(strM28549, "/");
                }
                linkedHashSet2.add(strM28549);
            }
        }
        return new ArrayList(linkedHashSet2);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final C12187 mo4494(Exception exc) {
        C12187 c12187M30465 = C12187.m30465(exc);
        m16836(c12187M30465);
        return c12187M30465;
    }
}
