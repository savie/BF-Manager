package l;

import android.content.DialogInterface;
import android.util.Pair;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B6V */
/* JADX INFO: loaded from: classes5.dex */
public final class C19804 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f63574;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f63576;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f63578;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f63579;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f63580;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f63581;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9221 f63582;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f63577 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public HashSet f63575 = new HashSet();

    public C19804(C9221 c9221, C11545 c11545, List list, Runnable runnable) {
        this.f63582 = c9221;
        this.f63579 = c11545;
        this.f63580 = list;
        this.f63578 = runnable;
        this.f63574 = c9221.f38587.m46690(C16845.m39503(c9221.m28629()));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777(this.f63579.m28824());
        c1777.mo5828((Runnable) null);
        c1777.m5837(R.string.MT_Protector);
        c1777.m5832("...");
        c1777.mo5843();
        this.f63581 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        C9221 c9221;
        AbstractC20745 abstractC20745 = this.f63574;
        if (abstractC20745.mo33971()) {
            abstractC20745.mo24647();
        }
        abstractC20745.m46739();
        List<C10840> list = this.f63580;
        C16667 c16667 = new C16667(list.size());
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c9221 = this.f63582;
            if (!zHasNext) {
                break;
            }
            C10840 c10840 = (C10840) it.next();
            String strM27170 = c10840.m27170();
            String strM27174 = c10840.m27174();
            boolean zM27176 = c10840.m27176();
            C18334 entry = c9221.f31344.getEntry(strM27174.substring(1) + strM27170);
            if (entry == null) {
                entry = zM27176 ? c9221.f31344.getEntry(strM27170) : null;
            }
            if (entry == null) {
                c10840.m27172();
            } else {
                c16667.mo8944(entry.m42575(), Pair.create(c10840, entry));
            }
        }
        C2189.m6799(c16667.keySet(), new C8515(this, c9221, this.f63581, c16667));
        if (this.f63581.m5824()) {
            return;
        }
        for (C10840 c10841 : list) {
            if (c10841.m27171() && c10841.m27177() == null) {
                throw new IOException("Extract file failed: " + c10841.m27170());
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f63581.m5824()) {
            this.f63574.mo24647();
        } else {
            this.f63576 = true;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f63574.mo24647();
        this.f63579.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f63581.m5825();
        C21094.m47530();
        if (!this.f63576) {
            return;
        }
        C9221 c9221 = this.f63582;
        Iterator it = c9221.m28631().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.f63577;
            if (zHasNext) {
                C23540 c23540 = (C23540) it.next();
                if (!this.f63575.contains(c23540.m51888())) {
                    arrayList.add(c23540);
                }
            } else {
                c9221.m28622((List) arrayList);
                try {
                    this.f63578.run();
                    return;
                } catch (Throwable th) {
                    this.f63579.m28824().m31002(th, (DialogInterface.OnDismissListener) null);
                    return;
                }
            }
        }
    }
}
