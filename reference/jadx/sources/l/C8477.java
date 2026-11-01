package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes3.dex */
public final class C8477 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f29385;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f29387;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f29389;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f29390;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f29391;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3062 f29392;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C4785 f29393;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9183 f29394;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f29388 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C16842 f29386 = new C16842(0);

    public C8477(C9183 c9183, C11545 c11545, C4245 c4245, List list, Runnable runnable) {
        this.f29394 = c9183;
        this.f29391 = c11545;
        this.f29392 = c4245;
        this.f29390 = list;
        this.f29389 = runnable;
        this.f29385 = c9183.f38587.m46690(C16845.m39503(c9183.m28629()));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C4785 c4785 = new C4785(this.f29391.m28824());
        c4785.m13292(C16737.m39283(R.string.MT_Protector));
        c4785.m13289((RunnableC10098) null);
        c4785.m13297();
        this.f29393 = c4785;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m22140() {
        return this.f29393.m13282() || this.f29392.mo9170() == EnumC9414.DESTROYED;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        AbstractC20745 abstractC20745 = this.f29385;
        if (abstractC20745.mo33971()) {
            abstractC20745.mo24647();
        }
        abstractC20745.m46739();
        ArrayList<C19766> arrayList = new ArrayList();
        final AbstractC12233 abstractC12233Mo13029 = this.f29394.mo13029();
        long size = 0;
        for (C10840 c10840 : this.f29390) {
            InterfaceC2557 interfaceC2557Mo10264 = abstractC12233Mo13029.mo10264(c10840.m27178());
            if (interfaceC2557Mo10264 != null) {
                C15404 c15404 = (C15404) interfaceC2557Mo10264;
                if (c15404.mo7985()) {
                    size += c15404.getSize();
                    C19766 c19766 = new C19766(0);
                    c19766.f63510 = c10840;
                    c19766.f63511 = interfaceC2557Mo10264;
                    c19766.f63509 = abstractC20745.m46690(c10840.m27169());
                    arrayList.add(c19766);
                }
            }
            c10840.m27172();
        }
        C3761 c3761 = new C3761(arrayList.size(), size);
        this.f29393.m13290(true);
        C7293 c7293 = new C7293(abstractC12233Mo13029);
        C19060 c19060 = new C19060(this, c3761);
        C16842 c16842 = this.f29386;
        c16842.m39499();
        try {
            InterfaceC5046 interfaceC5046Distinct = C9030.stream(arrayList).map(new C21882()).distinct();
            C13638.requireNonNull(abstractC12233Mo13029);
            interfaceC5046Distinct.forEach(new Consumer() { // from class: l.ᩳ᩺֨
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    abstractC12233Mo13029.mo10269((String) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }
            });
            for (C19766 c19767 : arrayList) {
                this.f29393.m13294(c19767.f63510.m27170());
                c7293.m19442(c19767.f63511.getPath(), c19767.f63509, c19060);
                if (!m22140()) {
                    c19767.f63510.m27173(c19767.f63509);
                    this.f29388.add(new C23540(c19767.f63509, c19767.f63509.getName(), c19767.f63511.getPath()));
                    c3761.m10992();
                } else {
                    c16842.m39498();
                    return;
                }
            }
            c16842.m39498();
        } catch (Throwable th) {
            c16842.m39498();
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (m22140()) {
            Iterator it = this.f29388.iterator();
            while (it.hasNext()) {
                ((C23540) it.next()).m51884().mo24644();
            }
            return;
        }
        this.f29387 = true;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f29391.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
        Iterator it = this.f29388.iterator();
        while (it.hasNext()) {
            ((C23540) it.next()).m51884().mo24644();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f29393.m13295();
        C21094.m47530();
        if (this.f29387) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = this.f29388;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(((C23540) it.next()).m51888().toLowerCase());
            }
            C9183 c9183 = this.f29394;
            int i = 0;
            for (C23540 c23540 : c9183.m28631()) {
                if (c23540.m51886() && hashSet.add(c23540.m51888().toLowerCase())) {
                    arrayList.add(i, c23540);
                    i++;
                }
            }
            c9183.m28621(arrayList);
            try {
                this.f29389.run();
            } catch (Throwable th) {
                this.f29391.m28824().m31002(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
