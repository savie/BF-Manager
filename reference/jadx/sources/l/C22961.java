package l;

import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BK */
/* JADX INFO: loaded from: classes2.dex */
public class C22961 extends C22689 {

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public boolean f74637;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private synchronized void m50805(C5202 c5202) {
        try {
            if (this.f74637) {
                return;
            }
            this.f74637 = true;
            String strM41585 = m41585("remoteTaskId");
            C7340 c7340M19608 = C7340.m19608();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(C18629.m43080(m41585("sourcePath")));
            linkedHashSet.add(C18629.m43080(m41585("targetPath")));
            ArrayList arrayList = new ArrayList(linkedHashSet);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it = m50806().iterator();
            while (it.hasNext()) {
                linkedHashSet2.add(C18629.m43080((String) it.next()));
            }
            ArrayList arrayList2 = new ArrayList(linkedHashSet2);
            List list = Collections.EMPTY_LIST;
            c7340M19608.m19615(strM41585, this, c5202, arrayList, arrayList2, list, c5202.m14380() ? m50806() : list);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // l.C22689, l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܶ */
    public final AbstractActivityC12483 mo21456() {
        return null;
    }

    @Override // l.C22689, l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        String strM41585 = m41585("remoteTaskId");
        C7340 c7340M19608 = C7340.m19608();
        C18727 c18727 = new C18727(strM41585, c7340M19608, m41565("replacedName") != null);
        this.f73877 = c18727;
        c7340M19608.m19616(strM41585, this, c18727);
        super.mo3075();
        c7340M19608.m19614(strM41585, this);
    }

    @Override // l.C22689, l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws Exception {
        C5202 c5202Mo3077 = super.mo3077();
        m50805(c5202Mo3077);
        return c5202Mo3077;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩷ */
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
    /* JADX INFO: renamed from: ۜ */
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

    @Override // l.C22689, l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        super.mo3079(c5202);
        m50805(c5202);
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    private List m50806() {
        if (this.f73875 == null) {
            return Collections.EMPTY_LIST;
        }
        String strM43080 = C18629.m43080(m41585("targetPath"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : m41566("ARG_PATHS")) {
            linkedHashSet.add(str);
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (AbstractC10444 abstractC10444 : this.f73875.m47385()) {
            if (linkedHashSet.contains(abstractC10444.m26362()) && abstractC10444.m26372() != null) {
                String strM18162 = C6730.m18162(strM43080, String.valueOf(abstractC10444.m26372()));
                if (abstractC10444.m26387()) {
                    strM18162 = C15489.m37076(strM18162, "/");
                }
                linkedHashSet2.add(strM18162);
            }
        }
        return new ArrayList(linkedHashSet2);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final C5202 mo6160(Exception exc) {
        C5202 c5202M14375 = C5202.m14375(exc);
        m50805(c5202M14375);
        return c5202M14375;
    }
}
