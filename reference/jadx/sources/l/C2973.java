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

/* JADX INFO: renamed from: l.ۗۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2973 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f11108;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC14264 f11109;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C11465 f11111;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C16608 f11112;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21026 f11114;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC9677 f11116;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f11113 = C16737.m39280();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9325 f11110 = new C9325();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashSet f11115 = new HashSet();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f11106 = new ArrayList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C19533 f11107 = new C19533();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8810(AbstractC9677 abstractC9677, String[] strArr, String str, InterfaceC14264 interfaceC14264) {
        this.f11116 = abstractC9677;
        this.f11109 = interfaceC14264;
        ArrayList arrayList = this.f11106;
        arrayList.clear();
        this.f11107.m44615();
        boolean z = strArr.length == 1 && !strArr[0].endsWith("/");
        this.f11108 = z;
        if (z) {
            ((C10695) interfaceC14264).f36506.m46154();
        }
        boolean z2 = (C5553.m15304(str) || C8272.m21690(str) != null || (abstractC9677 instanceof C8289) || (abstractC9677 instanceof C7813)) ? false : true;
        C21026.m47368(strArr, abstractC9677, z2);
        C2462.m7541(str, EnumC11636.MODIFY_DIRECTORY);
        C5553.m15313(str, new String[0]).m46739();
        C17085 c17085 = new C17085(interfaceC14264);
        this.f11112 = new C16608(false);
        C11465 c11465M28644 = C11465.m28644(abstractC9677);
        this.f11111 = c11465M28644;
        C21026 c21026M47356 = C21026.m47356(str, this.f11112, c17085, new C0151(c11465M28644));
        this.f11114 = c21026M47356;
        if ((abstractC9677 instanceof C8289) || (abstractC9677 instanceof C7813)) {
            c21026M47356.m47384();
        } else if (z2) {
            c21026M47356.m47387();
        }
        this.f11114.m47386();
        this.f11114.m47381(strArr, abstractC9677, true, false);
        C23395 c23395 = ((C10695) interfaceC14264).f36506;
        if (c23395.mo2357()) {
            return;
        }
        if (this.f11114.m47383(false)) {
            boolean zMo24621 = abstractC9677.mo24621();
            C9325 c9325 = this.f11110;
            if (!zMo24621) {
                Iterator it = this.f11114.m47385().iterator();
                while (it.hasNext()) {
                    m8800((AbstractC10444) it.next());
                }
                m8801(false);
            } else {
                HashMap map = new HashMap();
                ArrayList<C19616> arrayList2 = new ArrayList();
                LinkedList linkedList = new LinkedList(this.f11114.m47385());
                while (!linkedList.isEmpty()) {
                    AbstractC10444 abstractC10444 = (AbstractC10444) linkedList.removeFirst();
                    if (abstractC10444.m26374()) {
                        arrayList.add(abstractC10444);
                        if (abstractC10444.m26387()) {
                            if (!abstractC10444.mo23365().m44704().isEmpty()) {
                                arrayList2.add(abstractC10444.mo23365());
                            }
                            linkedList.addAll(0, abstractC10444.mo23365().m44704());
                        }
                    } else if (abstractC10444.m26387()) {
                        arrayList2.add(abstractC10444.mo23365());
                        linkedList.addAll(0, abstractC10444.mo23365().m44704());
                    } else {
                        map.put(this.f11116.m24620(abstractC10444.m26362()), abstractC10444.mo23366());
                    }
                }
                for (C19616 c19616 : arrayList2) {
                    m8807(c19616);
                    if (!c19616.m26389()) {
                        c19616.m26394().m46739();
                    }
                    if (c19616.m26372() != null) {
                        this.f11115.add((String) c19616.m26372());
                    }
                    if (((C10695) this.f11109).f36506.mo2357()) {
                    }
                }
                IOException[] iOExceptionArr = {null};
                this.f11116.mo24617(map.keySet(), new C23436(this, map, iOExceptionArr));
                IOException iOException = iOExceptionArr[0];
                if (iOException == null) {
                    if (!((C10695) this.f11109).f36506.mo2357()) {
                        if (this.f11113) {
                            for (C19616 c19617 : arrayList2) {
                                if (!c19617.m26389() && c19617.m26392() > 0) {
                                    AbstractC20745 abstractC20745M26394 = c19617.m26394();
                                    if (abstractC20745M26394.mo8448()) {
                                        c9325.m23972(abstractC20745M26394, c19617.m26392());
                                    }
                                }
                            }
                        }
                        m8801(true);
                    }
                } else {
                    throw iOException;
                }
            }
            c9325.m23971();
            return;
        }
        c23395.cancel();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet m8809() {
        return this.f11115;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8800(AbstractC10444 abstractC10444) throws IOException {
        if (((C10695) this.f11109).f36506.mo2357()) {
            return;
        }
        m8807(abstractC10444);
        AbstractC20745 abstractC20745M26394 = abstractC10444.m26394();
        if (abstractC10444.m26374()) {
            this.f11106.add(abstractC10444);
            if (abstractC10444.m26387() && !abstractC10444.m26389() && !abstractC10444.mo23365().m44704().isEmpty()) {
                abstractC20745M26394.m46739();
            }
            if (!((C10695) this.f11109).f36506.mo2357() && abstractC10444.m26387()) {
                Iterator it = abstractC10444.mo23365().m44704().iterator();
                while (it.hasNext()) {
                    m8800((AbstractC10444) it.next());
                }
                return;
            }
            return;
        }
        if (!abstractC10444.m26387()) {
            InterfaceC2557 interfaceC2557M24620 = this.f11116.m24620(abstractC10444.m26362());
            if (this.f11108) {
                C8141 c8141Mo24616 = this.f11116.mo24616(interfaceC2557M24620);
                try {
                    if (c8141Mo24616 == null) {
                        ((C10695) this.f11109).f36506.cancel();
                        if (c8141Mo24616 != null) {
                            c8141Mo24616.close();
                            return;
                        }
                        return;
                    }
                    C8516 c8516M21449 = c8141Mo24616.m21449();
                    InterfaceC14264 interfaceC14264 = this.f11109;
                    C13638.requireNonNull(interfaceC14264);
                    c8516M21449.m22241(new C16380(interfaceC14264));
                    if (!m8803(abstractC10444.mo23366(), interfaceC2557M24620)) {
                        if (!((C10695) this.f11109).f36506.mo2357()) {
                            m8797((InputStream) c8141Mo24616, ((C15404) interfaceC2557M24620).getSize(), false);
                        }
                        c8141Mo24616.close();
                        return;
                    } else {
                        abstractC20745M26394 = abstractC10444.m26394();
                        final InterfaceC14264 interfaceC14265 = this.f11109;
                        C13638.requireNonNull(interfaceC14265);
                        abstractC20745M26394.m46716(c8141Mo24616, -1L, new InterfaceC8978() { // from class: l.۫ۗ᩹
                            @Override // l.InterfaceC5614
                            /* JADX INFO: renamed from: ֨ */
                            public final boolean mo2357() {
                                return ((C10695) interfaceC14265).mo2357();
                            }

                            @Override // l.InterfaceC8978
                            /* JADX INFO: renamed from: ۘۙ */
                            public final /* synthetic */ void mo2885() {
                                throw null;
                            }
                        });
                        c8141Mo24616.close();
                    }
                } catch (Throwable th) {
                    if (c8141Mo24616 != null) {
                        try {
                            c8141Mo24616.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                InputStream inputStreamMo15073 = this.f11116.mo15073((AbstractActivityC12483) null, interfaceC2557M24620);
                try {
                    if (inputStreamMo15073 == null) {
                        ((C10695) this.f11109).f36506.cancel();
                        if (inputStreamMo15073 != null) {
                            inputStreamMo15073.close();
                            return;
                        }
                        return;
                    }
                    if (!m8803(abstractC10444.mo23366(), interfaceC2557M24620)) {
                        if (!((C10695) this.f11109).f36506.mo2357()) {
                            m8797(inputStreamMo15073, ((C15404) interfaceC2557M24620).getSize(), true);
                            if (!((C10695) this.f11109).f36506.mo2357()) {
                                this.f11114.m10994(abstractC10444.m26359());
                            }
                        }
                        inputStreamMo15073.close();
                        return;
                    }
                    AbstractC20745 abstractC20745M26395 = abstractC10444.m26394();
                    abstractC20745M26395.m46716(inputStreamMo15073, ((C15404) interfaceC2557M24620).getSize(), new C5796(this));
                    inputStreamMo15073.close();
                    this.f11114.m10994(abstractC10444.m26359());
                    abstractC20745M26394 = abstractC20745M26395;
                } catch (Throwable th3) {
                    if (inputStreamMo15073 != null) {
                        try {
                            inputStreamMo15073.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            if (((C10695) this.f11109).f36506.mo2357()) {
                abstractC20745M26394.mo24644();
                return;
            }
            if (abstractC10444.m26370() != null) {
                C5222 c5222 = new C5222();
                c5222.m14405(abstractC10444.m26370());
                c5222.m14402(abstractC20745M26394);
            }
            this.f11107.m44616(abstractC10444.m26393(), abstractC20745M26394.getName());
        } else if (!abstractC10444.m26389()) {
            abstractC20745M26394.m46739();
        }
        if (((C10695) this.f11109).f36506.mo2357()) {
            return;
        }
        if (!abstractC10444.m26387()) {
            C22252.m49408(abstractC10444.m26385(), true);
        }
        if (abstractC10444.m26372() != null) {
            this.f11115.add((String) abstractC10444.m26372());
        }
        if (abstractC10444.m26387()) {
            Iterator it2 = abstractC10444.mo23365().m44704().iterator();
            while (it2.hasNext()) {
                m8800((AbstractC10444) it2.next());
            }
        }
        if (this.f11113 && abstractC10444.m26392() > 0 && abstractC20745M26394.mo8448()) {
            if (abstractC10444.m26387() && abstractC10444.m26389()) {
                return;
            }
            this.f11110.m23972(abstractC20745M26394, abstractC10444.m26392());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m8803(C9033 c9033, InterfaceC2557 interfaceC2557) {
        if (!((C10695) this.f11109).f36506.mo2357()) {
            if (c9033.m26389()) {
                AbstractC20745 abstractC20745M26394 = c9033.m26394();
                if (!c9033.m26388() && this.f11111.m28649(abstractC20745M26394)) {
                    if (!((C10695) this.f11109).f36506.mo2357()) {
                        this.f11112.getClass();
                        int iMo11423 = this.f11112.mo11423(c9033.m26393(), C20321.m45855(interfaceC2557), C20321.m45856(abstractC20745M26394), abstractC20745M26394.mo35233(), true);
                        if (this.f11112.mo2357()) {
                            ((C10695) this.f11109).f36506.cancel();
                            return false;
                        }
                        if (iMo11423 == 2) {
                            c9033.m26386();
                            c9033.m26366((C2399) null);
                            c9033.m26384(false);
                        }
                    }
                }
                if (!c9033.m26388()) {
                    if (c9033.m26376()) {
                        abstractC20745M26394.mo35234(this.f11109);
                        return true;
                    }
                    abstractC20745M26394.mo24647();
                    return true;
                }
                AbstractC20745 abstractC20745M46693 = abstractC20745M26394.m46693(true);
                c9033.m26383(abstractC20745M46693);
                if (c9033.m26372() != null) {
                    c9033.m26361(abstractC20745M46693.getName());
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m8797(InputStream inputStream, long j, boolean z) {
        int i;
        byte[] bArr = new byte[32768];
        long j2 = 0;
        while (!((C10695) this.f11109).f36506.mo2357() && (i = inputStream.read(bArr)) != -1) {
            j2 += (long) i;
            if (z && j >= 0) {
                ((C10695) this.f11109).f36506.m46157(C8516.m22238(j2, j));
                ((C10695) this.f11109).f36506.mo21455(C8516.m22238(this.f11114.m10995() + j2, this.f11114.m10997()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m8807(AbstractC10444 abstractC10444) {
        this.f11114.m10992();
        InterfaceC14264 interfaceC14264 = this.f11109;
        int iM10991 = this.f11114.m10991();
        int iM10990 = this.f11114.m10990();
        C23395 c23395 = ((C10695) interfaceC14264).f36506;
        if (iM10990 > 1) {
            StringBuilder sb = new StringBuilder();
            int i = C23395.f75783;
            sb.append(C16737.m39288(R.string.MT_Protector));
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(iM10991);
            sb.append("/");
            sb.append(iM10990);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            c23395.mo21457(sb.toString());
        } else {
            c23395.m41591(R.string.MT_Protector);
        }
        c23395.mo41554(abstractC10444.m26393());
        if (this.f11108) {
            return;
        }
        ((C10695) this.f11109).f36506.m46157(0);
        InterfaceC14264 interfaceC14265 = this.f11109;
        ((C10695) interfaceC14265).f36506.mo21455(this.f11114.m10996());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8801(boolean z) throws IOException {
        ArrayList<AbstractC10444> arrayList = this.f11106;
        for (AbstractC10444 abstractC10444 : arrayList) {
            if (z && (!abstractC10444.m26387() || abstractC10444.mo23365().m44704().isEmpty())) {
                m8807(abstractC10444);
            }
            if (!((C10695) this.f11109).f36506.mo2357()) {
                String str = abstractC10444.m26393() + "/";
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        AbstractC20745 abstractC20745M26394 = abstractC10444.m26394();
                        if (abstractC20745M26394.mo33975()) {
                            break;
                        }
                        String strM26360 = abstractC10444.m26360();
                        if (strM26360 == null) {
                            throw new IOException("Archive symbolic link target is missing: " + abstractC10444.m26393());
                        }
                        abstractC20745M26394.mo46720();
                        abstractC20745M26394.mo33977(this.f11107.m44617(abstractC10444.m26393(), strM26360));
                        if (!abstractC10444.m26387()) {
                            C22252.m49408(abstractC10444.m26385(), true);
                        }
                        if (abstractC10444.m26372() == null) {
                            break;
                        }
                        this.f11115.add((String) abstractC10444.m26372());
                        break;
                    }
                    AbstractC10444 abstractC10445 = (AbstractC10444) it.next();
                    if (abstractC10445 != abstractC10444 && abstractC10445.m26393().startsWith(str)) {
                        break;
                    }
                }
            }
        }
    }
}
