package l;

import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: G7BL */
/* JADX INFO: loaded from: classes5.dex */
public class C16948 extends C22479 {

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public boolean f55370;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private synchronized void m39925(C12187 c12187) {
        try {
            if (this.f55370) {
                return;
            }
            this.f55370 = true;
            String strM43865 = m43865("remoteTaskId");
            C21949 c21949M49661 = C21949.m49661();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(C8284.m22375(m43865("sourcePath")));
            linkedHashSet.add(C8284.m22375(m43865("targetPath")));
            c21949M49661.m49668(strM43865, this, c12187, new ArrayList(linkedHashSet), m39924(), c12187.m30474() ? m39923() : Collections.EMPTY_LIST, c12187.m30474() ? m39921() : Collections.EMPTY_LIST);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // l.C22479, l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܺ */
    public final AbstractActivityC17204 mo16840() {
        return null;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩶ۙ */
    public final boolean mo29449() {
        return false;
    }

    @Override // l.C22479, l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        String strM43865 = m43865("remoteTaskId");
        C21949 c21949M49661 = C21949.m49661();
        C25154 c25154 = new C25154(strM43865, c21949M49661, false);
        this.f72749 = c25154;
        c25154.mo28702();
        c21949M49661.m49669(strM43865, this, (C25154) this.f72749);
        super.mo2528();
        c21949M49661.m49667(strM43865, this);
    }

    @Override // l.C22479, l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws Exception {
        C12187 c12187Mo2531 = super.mo2531();
        m39925(c12187Mo2531);
        return c12187Mo2531;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۘ */
    public final void mo16837(String str) {
        super.mo16837(str);
        C21949.m49661().m49667(m43865("remoteTaskId"), this);
    }

    @Override // l.AbstractC15118
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16841(CharSequence charSequence) {
        super.mo16841(charSequence);
        C21949.m49661().m49667(m43865("remoteTaskId"), this);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final void mo16839(int i) {
        super.mo16839(i);
        C21949.m49661().m49667(m43865("remoteTaskId"), this);
    }

    @Override // l.AbstractC15118
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16842(C1858 c1858) {
        super.mo16842(c1858);
        C21949.m49661().m49667(m43865("remoteTaskId"), this);
    }

    @Override // l.AbstractC15118
    /* JADX INFO: renamed from: ۙ */
    public final void mo16838(long j) {
        super.mo16838(j);
        C21949.m49661().m49667(m43865("remoteTaskId"), this);
    }

    @Override // l.C22479, l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        super.mo2533(c12187);
        m39925(c12187);
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m39924() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : m43831("ARG_PATHS")) {
            linkedHashSet.add(C8284.m22373(str));
        }
        Iterator it = m39921().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C8284.m22375((String) it.next()));
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m39921() {
        Map mapM39922 = m39922();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : m43831("ARG_PATHS")) {
            AbstractC6662 abstractC6662 = (AbstractC6662) mapM39922.get(C8284.m22373(str));
            if (abstractC6662 != null) {
                String strM18626 = abstractC6662.m18626();
                if (abstractC6662.m18625() && !strM18626.endsWith("/")) {
                    strM18626 = strM18626.concat("/");
                }
                linkedHashSet.add(strM18626);
            }
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m39923() {
        Map mapM39922 = m39922();
        ArrayList arrayList = new ArrayList();
        for (String str : m43831("ARG_PATHS")) {
            String strM22373 = C8284.m22373(str);
            AbstractC6662 abstractC6662 = (AbstractC6662) mapM39922.get(strM22373);
            if (abstractC6662 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("from", strM22373);
                linkedHashMap.put("to", C8284.m22375(abstractC6662.m18626()));
                arrayList.add(linkedHashMap);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    private Map m39922() {
        if (this.f72756 == null) {
            return Collections.EMPTY_MAP;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : m43831("ARG_PATHS")) {
            linkedHashMap.put(C8284.m22373(str), null);
        }
        for (AbstractC6662 abstractC6662 : this.f72756.m14079()) {
            String strM22373 = C8284.m22373(abstractC6662.m18604());
            if (linkedHashMap.containsKey(strM22373)) {
                linkedHashMap.put(strM22373, abstractC6662);
            }
        }
        for (AbstractC6662 abstractC6663 : this.f72756.m14080()) {
            String strM22374 = C8284.m22373(abstractC6663.m18604());
            if (linkedHashMap.containsKey(strM22374) && linkedHashMap.get(strM22374) == null) {
                linkedHashMap.put(strM22374, abstractC6663);
            }
        }
        return linkedHashMap;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final C12187 mo4494(Exception exc) {
        C12187 c12187M30465 = C12187.m30465(exc);
        m39925(c12187M30465);
        return c12187M30465;
    }
}
