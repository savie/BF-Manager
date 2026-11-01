package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ᩴ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V8BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C18396 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC9677 f58641;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC17690 f58642;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f58643;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21026 f58644;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42675(AbstractC20745 abstractC20745, AbstractC9677 abstractC9677, String[] strArr, InterfaceC17690 interfaceC17690) throws IOException {
        this.f58641 = abstractC9677;
        this.f58642 = interfaceC17690;
        boolean z = false;
        if (strArr.length == 1 && !strArr[0].endsWith("/")) {
            z = true;
        }
        this.f58643 = z;
        C21026 c21026M47358 = C21026.m47358(new C6401(interfaceC17690));
        this.f58644 = c21026M47358;
        c21026M47358.m47379(strArr, abstractC9677);
        C22918 c22918 = new C22918(abstractC20745);
        try {
            c22918.m50733(36);
            if (abstractC9677.mo24621()) {
                m42672(c22918);
            } else {
                Iterator it = this.f58644.m47385().iterator();
                while (it.hasNext()) {
                    m42673(c22918, (AbstractC10444) it.next());
                }
            }
            c22918.close();
        } catch (Throwable th) {
            try {
                c22918.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42671(C12107 c12107, AbstractC10444 abstractC10444) {
        C20573 c20573 = new C20573();
        if (abstractC10444.m26374()) {
            c20573.m46416(abstractC10444.m26360());
        }
        C2399 c2399M26370 = abstractC10444.m26370();
        if (c2399M26370 != null) {
            c20573.m46415(Integer.valueOf(c2399M26370.f9657));
        }
        c12107.m30108(c20573);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42673(C22918 c22918, AbstractC10444 abstractC10444) throws IOException {
        if (this.f58642.mo2357()) {
            return;
        }
        this.f58644.m10992();
        InterfaceC17690 interfaceC17690 = this.f58642;
        this.f58644.m10991();
        this.f58644.getClass();
        interfaceC17690.mo38357(abstractC10444);
        if (!this.f58643) {
            this.f58642.getClass();
            this.f58642.setProgress(this.f58644.m10996());
        }
        if (abstractC10444.m26387()) {
            C12107 c12107 = new C12107(abstractC10444.m26385() + "/");
            c12107.setTime(abstractC10444.m26392());
            m42671(c12107, abstractC10444);
            c22918.m50727(c12107);
        } else {
            C12107 c12108 = new C12107(abstractC10444.m26385());
            c12108.setTime(abstractC10444.m26392());
            m42671(c12108, abstractC10444);
            c22918.m50727(c12108);
            InterfaceC2557 interfaceC2557M24620 = this.f58641.m24620(abstractC10444.m26362());
            if (abstractC10444.m26374()) {
                this.f58642.getClass();
            } else if (!this.f58643) {
                InputStream inputStreamMo15073 = this.f58641.mo15073((AbstractActivityC12483) null, interfaceC2557M24620);
                try {
                    if (inputStreamMo15073 == null) {
                        this.f58642.mo38356();
                        if (inputStreamMo15073 != null) {
                            inputStreamMo15073.close();
                            return;
                        }
                        return;
                    }
                    C22487.m49992(inputStreamMo15073, c22918.m50720(), ((C15404) interfaceC2557M24620).getSize(), new C22630(this));
                    inputStreamMo15073.close();
                } catch (Throwable th) {
                    if (inputStreamMo15073 != null) {
                        try {
                            inputStreamMo15073.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                C8141 c8141Mo24616 = this.f58641.mo24616(interfaceC2557M24620);
                try {
                    if (c8141Mo24616 == null) {
                        this.f58642.mo38356();
                        if (c8141Mo24616 != null) {
                            c8141Mo24616.close();
                            return;
                        }
                        return;
                    }
                    C8516 c8516M21449 = c8141Mo24616.m21449();
                    InterfaceC17690 interfaceC17691 = this.f58642;
                    C13638.requireNonNull(interfaceC17691);
                    c8516M21449.m22241(new C23340(interfaceC17691));
                    OutputStream outputStreamM50720 = c22918.m50720();
                    final InterfaceC17690 interfaceC17692 = this.f58642;
                    C13638.requireNonNull(interfaceC17692);
                    C22487.m49992(c8141Mo24616, outputStreamM50720, -1L, new InterfaceC8978() { // from class: l.ۘ֡֨
                        @Override // l.InterfaceC5614
                        /* JADX INFO: renamed from: ֨ */
                        public final boolean mo2357() {
                            return interfaceC17692.mo2357();
                        }

                        @Override // l.InterfaceC8978
                        /* JADX INFO: renamed from: ۘۙ */
                        public final /* synthetic */ void mo2885() {
                            throw null;
                        }
                    });
                    c8141Mo24616.close();
                } catch (Throwable th3) {
                    if (c8141Mo24616 != null) {
                        try {
                            c8141Mo24616.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            this.f58644.m10994(abstractC10444.mo23366().m26359());
        }
        if (!this.f58642.mo2357() && abstractC10444.m26387()) {
            Iterator it = abstractC10444.mo23365().m44704().iterator();
            while (it.hasNext()) {
                m42673(c22918, (AbstractC10444) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42672(C22918 c22918) throws IOException {
        HashMap map = new HashMap();
        ArrayList<C19616> arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList(this.f58644.m47385());
        while (!linkedList.isEmpty()) {
            AbstractC10444 abstractC10444 = (AbstractC10444) linkedList.removeFirst();
            if (abstractC10444.m26387()) {
                arrayList.add(abstractC10444.mo23365());
                linkedList.addAll(0, abstractC10444.mo23365().m44704());
            } else {
                map.put(this.f58641.m24620(abstractC10444.m26362()), abstractC10444.mo23366());
            }
        }
        for (C19616 c19616 : arrayList) {
            this.f58644.m10992();
            InterfaceC17690 interfaceC17690 = this.f58642;
            this.f58644.m10991();
            this.f58644.getClass();
            interfaceC17690.mo38357(c19616);
            C12107 c12107 = new C12107(c19616.m26385() + "/");
            c12107.setTime(c19616.m26392());
            m42671(c12107, c19616);
            c22918.m50727(c12107);
            if (this.f58642.mo2357()) {
                return;
            }
        }
        IOException[] iOExceptionArr = {null};
        this.f58641.mo24617(map.keySet(), new C21218(this, map, c22918, iOExceptionArr));
        IOException iOException = iOExceptionArr[0];
        if (iOException != null) {
            throw iOException;
        }
    }
}
