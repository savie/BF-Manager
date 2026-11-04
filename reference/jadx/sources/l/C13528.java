package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.۬֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13528 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f42982;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2342 f42983;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C18616 f42985;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22763 f42986;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C4424 f42990;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC7629 f42992;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f42984 = C21576.m49078();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6817 f42989 = new C6817();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashSet f42988 = new HashSet();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f42987 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3480 f42991 = new C3480();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33231(AbstractC7629 abstractC7629, String[] strArr, String str, InterfaceC2342 interfaceC2342) {
        this.f42992 = abstractC7629;
        this.f42983 = interfaceC2342;
        ArrayList arrayList = this.f42987;
        arrayList.clear();
        this.f42991.m11431();
        int i = 1;
        boolean z = strArr.length == 1 && !strArr[0].endsWith("/");
        this.f42982 = z;
        if (z) {
            ((C1178) interfaceC2342).f4312.m45192();
        }
        boolean z2 = (C14584.m35214(str) || C17743.m41554(str) != null || (abstractC7629 instanceof C24320) || (abstractC7629 instanceof C14426)) ? false : true;
        C4424.m14062(strArr, abstractC7629, z2);
        C6265.m17912(str, EnumC12230.MODIFY_DIRECTORY);
        C14584.m35193(str, new String[0]).m49853();
        C18749 c18749 = new C18749(interfaceC2342);
        this.f42985 = new C18616(false);
        C22763 c22763M51335 = C22763.m51335(abstractC7629);
        this.f42986 = c22763M51335;
        C4424 c4424M14049 = C4424.m14049(str, this.f42985, c18749, new C8579(i, c22763M51335));
        this.f42990 = c4424M14049;
        if ((abstractC7629 instanceof C24320) || (abstractC7629 instanceof C14426)) {
            c4424M14049.m14077();
        } else if (z2) {
            c4424M14049.m14081();
        }
        this.f42990.m14078();
        this.f42990.m14074(strArr, abstractC7629, true, false);
        C9380 c9380 = ((C1178) interfaceC2342).f4312;
        if (c9380.mo924()) {
            return;
        }
        if (this.f42990.m14076(false)) {
            boolean zMo20841 = abstractC7629.mo20841();
            C6817 c6817 = this.f42989;
            if (!zMo20841) {
                Iterator it = this.f42990.m14079().iterator();
                while (it.hasNext()) {
                    m33218((AbstractC6662) it.next());
                }
                m33221(false);
            } else {
                HashMap map = new HashMap();
                ArrayList<C20832> arrayList2 = new ArrayList();
                LinkedList linkedList = new LinkedList(this.f42990.m14079());
                while (!linkedList.isEmpty()) {
                    AbstractC6662 abstractC6662 = (AbstractC6662) linkedList.removeFirst();
                    if (abstractC6662.m18605()) {
                        arrayList.add(abstractC6662);
                        if (abstractC6662.m18625()) {
                            if (!abstractC6662.mo18607().m47638().isEmpty()) {
                                arrayList2.add(abstractC6662.mo18607());
                            }
                            linkedList.addAll(0, abstractC6662.mo18607().m47638());
                        }
                    } else if (abstractC6662.m18625()) {
                        arrayList2.add(abstractC6662.mo18607());
                        linkedList.addAll(0, abstractC6662.mo18607().m47638());
                    } else {
                        map.put(this.f42992.m20843(abstractC6662.m18604()), abstractC6662.mo18632());
                    }
                }
                for (C20832 c20832 : arrayList2) {
                    m33228(c20832);
                    if (!c20832.m18630()) {
                        c20832.m18641().m49853();
                    }
                    if (c20832.m18620() != null) {
                        this.f42988.add((String) c20832.m18620());
                    }
                    if (((C1178) this.f42983).f4312.mo924()) {
                    }
                }
                IOException[] iOExceptionArr = {null};
                this.f42992.mo20834(map.keySet(), new C9053(this, map, iOExceptionArr));
                IOException iOException = iOExceptionArr[0];
                if (iOException == null) {
                    if (!((C1178) this.f42983).f4312.mo924()) {
                        if (this.f42984) {
                            for (C20832 c20833 : arrayList2) {
                                if (!c20833.m18630() && c20833.m18627() > 0) {
                                    AbstractC22044 abstractC22044M18641 = c20833.m18641();
                                    if (abstractC22044M18641.mo2945()) {
                                        c6817.m18993(abstractC22044M18641, c20833.m18627());
                                    }
                                }
                            }
                        }
                        m33221(true);
                    }
                } else {
                    throw iOException;
                }
            }
            c6817.m18992();
            return;
        }
        c9380.cancel();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet m33230() {
        return this.f42988;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33218(AbstractC6662 abstractC6662) throws IOException {
        if (((C1178) this.f42983).f4312.mo924()) {
            return;
        }
        m33228(abstractC6662);
        AbstractC22044 abstractC22044M18641 = abstractC6662.m18641();
        if (abstractC6662.m18605()) {
            this.f42987.add(abstractC6662);
            if (abstractC6662.m18625() && !abstractC6662.m18630() && !abstractC6662.mo18607().m47638().isEmpty()) {
                abstractC22044M18641.m49853();
            }
            if (!((C1178) this.f42983).f4312.mo924() && abstractC6662.m18625()) {
                Iterator it = abstractC6662.mo18607().m47638().iterator();
                while (it.hasNext()) {
                    m33218((AbstractC6662) it.next());
                }
                return;
            }
            return;
        }
        if (!abstractC6662.m18625()) {
            InterfaceC2386 interfaceC2386M20843 = this.f42992.m20843(abstractC6662.m18604());
            if (this.f42982) {
                C23838 c23838Mo20832 = this.f42992.mo20832(interfaceC2386M20843);
                try {
                    if (c23838Mo20832 == null) {
                        ((C1178) this.f42983).f4312.cancel();
                        if (c23838Mo20832 != null) {
                            c23838Mo20832.close();
                            return;
                        }
                        return;
                    }
                    C3374 c3374M53163 = c23838Mo20832.m53163();
                    final InterfaceC2342 interfaceC2342 = this.f42983;
                    C17359.requireNonNull(interfaceC2342);
                    c3374M53163.m11078(new InterfaceC17544() { // from class: l.֡֫۫
                        @Override // l.InterfaceC17544
                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                        public final void mo1209(int i) {
                            ((C1178) interfaceC2342).f4312.mo16839(i);
                        }
                    });
                    if (!m33222(abstractC6662.mo18632(), interfaceC2386M20843)) {
                        if (!((C1178) this.f42983).f4312.mo924()) {
                            m33217((InputStream) c23838Mo20832, ((C13352) interfaceC2386M20843).getSize(), false);
                        }
                        c23838Mo20832.close();
                        return;
                    } else {
                        abstractC22044M18641 = abstractC6662.m18641();
                        final InterfaceC2342 interfaceC2343 = this.f42983;
                        C17359.requireNonNull(interfaceC2343);
                        abstractC22044M18641.m49872(c23838Mo20832, -1L, new InterfaceC23711() { // from class: l.۟֫۫
                            @Override // l.InterfaceC23711
                            /* JADX INFO: renamed from: ֫ۙ */
                            public final /* synthetic */ void mo3465() {
                                throw null;
                            }

                            @Override // l.InterfaceC7509
                            /* JADX INFO: renamed from: ۫ */
                            public final boolean mo924() {
                                return ((C1178) interfaceC2343).mo924();
                            }
                        });
                        c23838Mo20832.close();
                    }
                } catch (Throwable th) {
                    if (c23838Mo20832 != null) {
                        try {
                            c23838Mo20832.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                InputStream inputStreamMo20829 = this.f42992.mo20829((AbstractActivityC17204) null, interfaceC2386M20843);
                try {
                    if (inputStreamMo20829 == null) {
                        ((C1178) this.f42983).f4312.cancel();
                        if (inputStreamMo20829 != null) {
                            inputStreamMo20829.close();
                            return;
                        }
                        return;
                    }
                    if (!m33222(abstractC6662.mo18632(), interfaceC2386M20843)) {
                        if (!((C1178) this.f42983).f4312.mo924()) {
                            m33217(inputStreamMo20829, ((C13352) interfaceC2386M20843).getSize(), true);
                            if (!((C1178) this.f42983).f4312.mo924()) {
                                this.f42990.m6378(abstractC6662.m18622());
                            }
                        }
                        inputStreamMo20829.close();
                        return;
                    }
                    AbstractC22044 abstractC22044M18642 = abstractC6662.m18641();
                    abstractC22044M18642.m49872(inputStreamMo20829, ((C13352) interfaceC2386M20843).getSize(), new C9798(this));
                    inputStreamMo20829.close();
                    this.f42990.m6378(abstractC6662.m18622());
                    abstractC22044M18641 = abstractC22044M18642;
                } catch (Throwable th3) {
                    if (inputStreamMo20829 != null) {
                        try {
                            inputStreamMo20829.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            if (((C1178) this.f42983).f4312.mo924()) {
                abstractC22044M18641.mo4287();
                return;
            }
            if (abstractC6662.m18628() != null) {
                C24523 c24523 = new C24523();
                c24523.m54793(abstractC6662.m18628());
                c24523.m54797(abstractC22044M18641);
            }
            this.f42991.m11432(abstractC6662.m18624(), abstractC22044M18641.getName());
        } else if (!abstractC6662.m18630()) {
            abstractC22044M18641.m49853();
        }
        if (((C1178) this.f42983).f4312.mo924()) {
            return;
        }
        if (!abstractC6662.m18625()) {
            C20108.m46233(abstractC6662.m18626(), true);
        }
        if (abstractC6662.m18620() != null) {
            this.f42988.add((String) abstractC6662.m18620());
        }
        if (abstractC6662.m18625()) {
            Iterator it2 = abstractC6662.mo18607().m47638().iterator();
            while (it2.hasNext()) {
                m33218((AbstractC6662) it2.next());
            }
        }
        if (this.f42984 && abstractC6662.m18627() > 0 && abstractC22044M18641.mo2945()) {
            if (abstractC6662.m18625() && abstractC6662.m18630()) {
                return;
            }
            this.f42989.m18993(abstractC22044M18641, abstractC6662.m18627());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m33222(C12627 c12627, InterfaceC2386 interfaceC2386) {
        if (!((C1178) this.f42983).f4312.mo924()) {
            if (c12627.m18630()) {
                AbstractC22044 abstractC22044M18641 = c12627.m18641();
                if (!c12627.m18639() && this.f42986.m51341(abstractC22044M18641)) {
                    if (!((C1178) this.f42983).f4312.mo924()) {
                        this.f42985.getClass();
                        int iMo28696 = this.f42985.mo28696(c12627.m18624(), C21578.m49095(interfaceC2386), C21578.m49096(abstractC22044M18641), abstractC22044M18641.mo4292(), true);
                        if (this.f42985.mo924()) {
                            ((C1178) this.f42983).f4312.cancel();
                            return false;
                        }
                        if (iMo28696 == 2) {
                            c12627.m18623();
                            c12627.m18611((C6623) null);
                            c12627.m18636(false);
                        }
                    }
                }
                if (!c12627.m18639()) {
                    if (c12627.m18616()) {
                        abstractC22044M18641.mo4300(this.f42983);
                        return true;
                    }
                    abstractC22044M18641.mo4296();
                    return true;
                }
                AbstractC22044 abstractC22044M49839 = abstractC22044M18641.m49839(true);
                c12627.m18635(abstractC22044M49839);
                if (c12627.m18620() != null) {
                    c12627.m18638(abstractC22044M49839.getName());
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m33217(InputStream inputStream, long j, boolean z) {
        int i;
        byte[] bArr = new byte[32768];
        long j2 = 0;
        while (!((C1178) this.f42983).f4312.mo924() && (i = inputStream.read(bArr)) != -1) {
            j2 += (long) i;
            if (z && j >= 0) {
                ((C1178) this.f42983).f4312.m45194(C3374.m11075(j2, j));
                ((C1178) this.f42983).f4312.mo16839(C3374.m11075(this.f42990.m6383() + j2, this.f42990.m6379()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m33228(AbstractC6662 abstractC6662) {
        this.f42990.m6376();
        InterfaceC2342 interfaceC2342 = this.f42983;
        int iM6385 = this.f42990.m6385();
        int iM6381 = this.f42990.m6381();
        C9380 c9380 = ((C1178) interfaceC2342).f4312;
        if (iM6381 > 1) {
            StringBuilder sb = new StringBuilder();
            int i = C9380.f30457;
            sb.append(C21576.m49088(R.string.MT_Protector));
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(iM6385);
            sb.append("/");
            sb.append(iM6381);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            c9380.mo16837(sb.toString());
        } else {
            c9380.m43868(R.string.MT_Protector);
        }
        c9380.mo29447(abstractC6662.m18624());
        if (this.f42982) {
            return;
        }
        ((C1178) this.f42983).f4312.m45194(0);
        InterfaceC2342 interfaceC2343 = this.f42983;
        ((C1178) interfaceC2343).f4312.mo16839(this.f42990.m6380());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33221(boolean z) throws IOException {
        ArrayList<AbstractC6662> arrayList = this.f42987;
        for (AbstractC6662 abstractC6662 : arrayList) {
            if (z && (!abstractC6662.m18625() || abstractC6662.mo18607().m47638().isEmpty())) {
                m33228(abstractC6662);
            }
            if (!((C1178) this.f42983).f4312.mo924()) {
                String str = abstractC6662.m18624() + "/";
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        AbstractC22044 abstractC22044M18641 = abstractC6662.m18641();
                        if (abstractC22044M18641.mo2934()) {
                            break;
                        }
                        String strM18637 = abstractC6662.m18637();
                        if (strM18637 == null) {
                            throw new IOException("Archive symbolic link target is missing: " + abstractC6662.m18624());
                        }
                        abstractC22044M18641.mo49834();
                        abstractC22044M18641.mo2946(this.f42991.m11433(abstractC6662.m18624(), strM18637));
                        if (!abstractC6662.m18625()) {
                            C20108.m46233(abstractC6662.m18626(), true);
                        }
                        if (abstractC6662.m18620() == null) {
                            break;
                        }
                        this.f42988.add((String) abstractC6662.m18620());
                        break;
                    }
                    AbstractC6662 abstractC6663 = (AbstractC6662) it.next();
                    if (abstractC6663 != abstractC6662 && abstractC6663.m18624().startsWith(str)) {
                        break;
                    }
                }
            }
        }
    }
}
