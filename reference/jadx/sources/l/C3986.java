package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۘۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: V8BV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3986 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC24124 f13634;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f13635;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C4424 f13636;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC7629 f13637;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12843(AbstractC22044 abstractC22044, AbstractC7629 abstractC7629, String[] strArr, InterfaceC24124 interfaceC24124) throws IOException {
        this.f13637 = abstractC7629;
        this.f13634 = interfaceC24124;
        boolean z = false;
        if (strArr.length == 1 && !strArr[0].endsWith("/")) {
            z = true;
        }
        this.f13635 = z;
        C4424 c4424M14052 = C4424.m14052(new C3240(interfaceC24124));
        this.f13636 = c4424M14052;
        c4424M14052.m14072(strArr, abstractC7629);
        C25179 c25179 = new C25179(abstractC22044);
        try {
            c25179.m56135(36);
            if (abstractC7629.mo20841()) {
                m12840(c25179);
            } else {
                Iterator it = this.f13636.m14079().iterator();
                while (it.hasNext()) {
                    m12841(c25179, (AbstractC6662) it.next());
                }
            }
            c25179.close();
        } catch (Throwable th) {
            try {
                c25179.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12839(C8002 c8002, AbstractC6662 abstractC6662) {
        C4273 c4273 = new C4273();
        if (abstractC6662.m18605()) {
            c4273.m13618(abstractC6662.m18637());
        }
        C6623 c6623M18628 = abstractC6662.m18628();
        if (c6623M18628 != null) {
            c4273.m13617(Integer.valueOf(c6623M18628.f22123));
        }
        c8002.m21821(c4273);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12841(C25179 c25179, AbstractC6662 abstractC6662) throws IOException {
        if (this.f13634.mo924()) {
            return;
        }
        this.f13636.m6376();
        InterfaceC24124 interfaceC24124 = this.f13634;
        this.f13636.m6385();
        this.f13636.getClass();
        interfaceC24124.mo43420(abstractC6662);
        if (!this.f13635) {
            this.f13634.getClass();
            this.f13634.setProgress(this.f13636.m6380());
        }
        if (abstractC6662.m18625()) {
            C8002 c8002 = new C8002(abstractC6662.m18626() + "/");
            c8002.setTime(abstractC6662.m18627());
            m12839(c8002, abstractC6662);
            c25179.m56125(c8002);
        } else {
            C8002 c8003 = new C8002(abstractC6662.m18626());
            c8003.setTime(abstractC6662.m18627());
            m12839(c8003, abstractC6662);
            c25179.m56125(c8003);
            InterfaceC2386 interfaceC2386M20843 = this.f13637.m20843(abstractC6662.m18604());
            if (abstractC6662.m18605()) {
                this.f13634.getClass();
            } else if (!this.f13635) {
                InputStream inputStreamMo20829 = this.f13637.mo20829((AbstractActivityC17204) null, interfaceC2386M20843);
                try {
                    if (inputStreamMo20829 == null) {
                        this.f13634.mo43419();
                        if (inputStreamMo20829 != null) {
                            inputStreamMo20829.close();
                            return;
                        }
                        return;
                    }
                    C21298.m48534(inputStreamMo20829, c25179.m56119(), ((C13352) interfaceC2386M20843).getSize(), new C20394(this));
                    inputStreamMo20829.close();
                } catch (Throwable th) {
                    if (inputStreamMo20829 != null) {
                        try {
                            inputStreamMo20829.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                C23838 c23838Mo20832 = this.f13637.mo20832(interfaceC2386M20843);
                try {
                    if (c23838Mo20832 == null) {
                        this.f13634.mo43419();
                        if (c23838Mo20832 != null) {
                            c23838Mo20832.close();
                            return;
                        }
                        return;
                    }
                    C3374 c3374M53163 = c23838Mo20832.m53163();
                    InterfaceC24124 interfaceC24125 = this.f13634;
                    C17359.requireNonNull(interfaceC24125);
                    c3374M53163.m11078(new C13688(interfaceC24125));
                    OutputStream outputStreamM56119 = c25179.m56119();
                    final InterfaceC24124 interfaceC24126 = this.f13634;
                    C17359.requireNonNull(interfaceC24126);
                    C21298.m48534(c23838Mo20832, outputStreamM56119, -1L, new InterfaceC23711() { // from class: l.᩹ۜ۫
                        @Override // l.InterfaceC23711
                        /* JADX INFO: renamed from: ֫ۙ */
                        public final /* synthetic */ void mo3465() {
                            throw null;
                        }

                        @Override // l.InterfaceC7509
                        /* JADX INFO: renamed from: ۫ */
                        public final boolean mo924() {
                            return interfaceC24126.mo924();
                        }
                    });
                    c23838Mo20832.close();
                } catch (Throwable th3) {
                    if (c23838Mo20832 != null) {
                        try {
                            c23838Mo20832.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            this.f13636.m6378(abstractC6662.mo18632().m18622());
        }
        if (!this.f13634.mo924() && abstractC6662.m18625()) {
            Iterator it = abstractC6662.mo18607().m47638().iterator();
            while (it.hasNext()) {
                m12841(c25179, (AbstractC6662) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12840(C25179 c25179) throws IOException {
        HashMap map = new HashMap();
        ArrayList<C20832> arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList(this.f13636.m14079());
        while (!linkedList.isEmpty()) {
            AbstractC6662 abstractC6662 = (AbstractC6662) linkedList.removeFirst();
            if (abstractC6662.m18625()) {
                arrayList.add(abstractC6662.mo18607());
                linkedList.addAll(0, abstractC6662.mo18607().m47638());
            } else {
                map.put(this.f13637.m20843(abstractC6662.m18604()), abstractC6662.mo18632());
            }
        }
        for (C20832 c20832 : arrayList) {
            this.f13636.m6376();
            InterfaceC24124 interfaceC24124 = this.f13634;
            this.f13636.m6385();
            this.f13636.getClass();
            interfaceC24124.mo43420(c20832);
            C8002 c8002 = new C8002(c20832.m18626() + "/");
            c8002.setTime(c20832.m18627());
            m12839(c8002, c20832);
            c25179.m56125(c8002);
            if (this.f13634.mo924()) {
                return;
            }
        }
        IOException[] iOExceptionArr = {null};
        this.f13637.mo20834(map.keySet(), new C6224(this, map, c25179, iOExceptionArr));
        IOException iOException = iOExceptionArr[0];
        if (iOException != null) {
            throw iOException;
        }
    }
}
