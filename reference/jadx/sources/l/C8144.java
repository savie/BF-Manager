package l;

import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.۠ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G7BL */
/* JADX INFO: loaded from: classes4.dex */
public class C8144 extends C11441 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public boolean f28495;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private synchronized void m21451(C5202 c5202) {
        try {
            if (this.f28495) {
                return;
            }
            this.f28495 = true;
            String strM41585 = m41585("remoteTaskId");
            C7340 c7340M19608 = C7340.m19608();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(C18629.m43080(m41585("sourcePath")));
            linkedHashSet.add(C18629.m43080(m41585("targetPath")));
            c7340M19608.m19615(strM41585, this, c5202, new ArrayList(linkedHashSet), m21454(), c5202.m14380() ? m21450() : Collections.EMPTY_LIST, c5202.m14380() ? m21453() : Collections.EMPTY_LIST);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // l.C11441, l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 mo21456() {
        return null;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩶ۙ */
    public final boolean mo18332() {
        return false;
    }

    @Override // l.C11441, l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        String strM41585 = m41585("remoteTaskId");
        C7340 c7340M19608 = C7340.m19608();
        C18727 c18727 = new C18727(strM41585, c7340M19608, false);
        this.f38496 = c18727;
        c18727.mo11427();
        c7340M19608.m19616(strM41585, this, (C18727) this.f38496);
        super.mo3075();
        c7340M19608.m19614(strM41585, this);
    }

    @Override // l.C11441, l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws Exception {
        C5202 c5202Mo3077 = super.mo3077();
        m21451(c5202Mo3077);
        return c5202Mo3077;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo21457(String str) {
        super.mo21457(str);
        C7340.m19608().m19614(m41585("remoteTaskId"), this);
    }

    @Override // l.AbstractC0656
    /* JADX INFO: renamed from: ܰ */
    public final void mo2982(CharSequence charSequence) {
        super.mo2982(charSequence);
        C7340.m19608().m19614(m41585("remoteTaskId"), this);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo21455(int i) {
        super.mo21455(i);
        C7340.m19608().m19614(m41585("remoteTaskId"), this);
    }

    @Override // l.AbstractC0656
    /* JADX INFO: renamed from: ܰ */
    public final void mo2983(C3761 c3761) {
        super.mo2983(c3761);
        C7340.m19608().m19614(m41585("remoteTaskId"), this);
    }

    @Override // l.AbstractC0656
    /* JADX INFO: renamed from: ۙ */
    public final void mo2975(long j) {
        super.mo2975(j);
        C7340.m19608().m19614(m41585("remoteTaskId"), this);
    }

    @Override // l.C11441, l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        super.mo3079(c5202);
        m21451(c5202);
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m21454() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : m41566("ARG_PATHS")) {
            linkedHashSet.add(C18629.m43078(str));
        }
        Iterator it = m21453().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C18629.m43080((String) it.next()));
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m21453() {
        Map mapM21452 = m21452();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : m41566("ARG_PATHS")) {
            AbstractC10444 abstractC10444 = (AbstractC10444) mapM21452.get(C18629.m43078(str));
            if (abstractC10444 != null) {
                String strM26385 = abstractC10444.m26385();
                if (abstractC10444.m26387() && !strM26385.endsWith("/")) {
                    strM26385 = strM26385.concat("/");
                }
                linkedHashSet.add(strM26385);
            }
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m21450() {
        Map mapM21452 = m21452();
        ArrayList arrayList = new ArrayList();
        for (String str : m41566("ARG_PATHS")) {
            String strM43078 = C18629.m43078(str);
            AbstractC10444 abstractC10444 = (AbstractC10444) mapM21452.get(strM43078);
            if (abstractC10444 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("from", strM43078);
                linkedHashMap.put("to", C18629.m43080(abstractC10444.m26385()));
                arrayList.add(linkedHashMap);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    private Map m21452() {
        if (this.f38494 == null) {
            return Collections.EMPTY_MAP;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : m41566("ARG_PATHS")) {
            linkedHashMap.put(C18629.m43078(str), null);
        }
        for (AbstractC10444 abstractC10444 : this.f38494.m47385()) {
            String strM43078 = C18629.m43078(abstractC10444.m26362());
            if (linkedHashMap.containsKey(strM43078)) {
                linkedHashMap.put(strM43078, abstractC10444);
            }
        }
        for (AbstractC10444 abstractC10445 : this.f38494.m47388()) {
            String strM43079 = C18629.m43078(abstractC10445.m26362());
            if (linkedHashMap.containsKey(strM43079) && linkedHashMap.get(strM43079) == null) {
                linkedHashMap.put(strM43079, abstractC10445);
            }
        }
        return linkedHashMap;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final C5202 mo6160(Exception exc) {
        C5202 c5202M14375 = C5202.m14375(exc);
        m21451(c5202M14375);
        return c5202M14375;
    }
}
