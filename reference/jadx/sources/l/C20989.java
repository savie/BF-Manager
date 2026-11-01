package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R5YB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20989 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f68337;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C20164 f68338;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f68339;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C2455 f68340;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f68341;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16051 f68342;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14558 f68343;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Collection f68344;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f68345;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public HashSet f68346 = new HashSet();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C15575 f68347;

    public C20989(AbstractC16051 abstractC16051, C14558 c14558, boolean z) {
        this.f68342 = abstractC16051;
        this.f68343 = c14558;
        this.f68345 = z;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C20164 c20164 = new C20164(this.f68342.f51937.m28824());
        c20164.m45586(R.string.MT_Protector);
        c20164.m45588("...");
        c20164.mo5828((Runnable) null);
        c20164.m45600();
        this.f68338 = c20164;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        HashSet hashSet;
        C12107 c12107;
        C12107 c12108;
        int i;
        C14558 c14558;
        C22918 c22918;
        int i2;
        AbstractC16051 abstractC16051 = this.f68342;
        AbstractC20745 abstractC20745M15313 = C5553.m15313(abstractC16051.f51935.m33624(), new String[0]);
        C2462.m7542(abstractC20745M15313, EnumC11636.MODIFY_FILE);
        C2455 c2455 = new C2455(abstractC20745M15313);
        this.f68340 = c2455;
        this.f68344 = c2455.m7466();
        C14558 c14559 = this.f68343;
        C15575 c15575M45035 = C19808.m45035(abstractC20745M15313, c14559 != null);
        this.f68347 = c15575M45035;
        C22918 c22918M37220 = c15575M45035.m37220();
        if (c14559 == null && this.f68345 && this.f68340.m7488()) {
            c22918M37220.m50726(this.f68340);
        }
        if (this.f68340.m7482()) {
            c22918M37220.m50718();
        }
        int size = ((ArrayList) abstractC16051.f51939).size();
        this.f68337 = 0L;
        Iterator it = ((ArrayList) abstractC16051.f51939).iterator();
        while (it.hasNext()) {
            this.f68337 = ((C23540) it.next()).m51884().mo33964() + this.f68337;
        }
        this.f68341 = 0L;
        C22918 c22918M37221 = this.f68347.m37220();
        C21123 c21123 = new C21123();
        if (abstractC16051.f51936) {
            c21123.m47548(this.f68340);
        }
        Iterator it2 = ((ArrayList) abstractC16051.f51939).iterator();
        int i3 = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            hashSet = this.f68346;
            if (!zHasNext) {
                break;
            }
            C23540 c23540 = (C23540) it2.next();
            if (this.f68338.m5824()) {
                break;
            }
            int i4 = i3 + 1;
            String strM51888 = c23540.m51888();
            AbstractC20745 abstractC20745M51884 = c23540.m51884();
            Iterator it3 = it2;
            Iterator it4 = this.f68344.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    c12107 = null;
                    break;
                }
                c12107 = (C12107) it4.next();
                Iterator it5 = it4;
                if (c12107.getName().equals(strM51888)) {
                    break;
                } else {
                    it4 = it5;
                }
            }
            if (c12107 == null) {
                c22918M37221.m50733(abstractC16051.f51936 ? C16185.m38271(strM51888, c21123) : 8);
                c22918M37221.m50719((String) null);
                c12108 = new C12107(strM51888);
            } else {
                c22918M37221.m50733(c12107.m30119());
                if (c12107.m30133()) {
                    c22918M37221.m50719(abstractC16051.f51935.m33622());
                } else {
                    c22918M37221.m50719((String) null);
                }
                c12108 = c12107;
            }
            C21123 c21124 = c21123;
            C20164 c20164 = this.f68338;
            AbstractC20745 abstractC20745 = abstractC20745M15313;
            StringBuilder sb = new StringBuilder();
            AbstractC16051 abstractC16052 = abstractC16051;
            sb.append(C16737.m39288(R.string.MT_Protector));
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(i4);
            sb.append("/");
            sb.append(size);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            c20164.m45592(sb.toString());
            this.f68338.m45588(strM51888);
            InputStream inputStreamMo33970 = abstractC20745M51884.mo33970();
            try {
                long jMo33964 = abstractC20745M51884.mo33964();
                c12108.m30096(jMo33964);
                int i5 = i4;
                c12108.setTime(abstractC20745M51884.mo33991());
                c22918M37221.m50727(c12108);
                byte[] bArr = new byte[4096];
                long j = 0;
                while (true) {
                    int i6 = inputStreamMo33970.read(bArr);
                    if (i6 > 0) {
                        i = i5;
                        c22918M37221.write(bArr, 0, i6);
                        c14558 = c14559;
                        c22918 = c22918M37220;
                        j += (long) i6;
                        this.f68338.m45594(j, c12108.getSize());
                        i2 = size;
                        byte[] bArr2 = bArr;
                        C12107 c12109 = c12108;
                        this.f68338.m45593(this.f68341 + j, this.f68337);
                        if (this.f68338.m5824()) {
                            break;
                        }
                        c14559 = c14558;
                        bArr = bArr2;
                        i5 = i;
                        c22918M37220 = c22918;
                        size = i2;
                        c12108 = c12109;
                    } else {
                        i = i5;
                        c14558 = c14559;
                        c22918 = c22918M37220;
                        i2 = size;
                        c22918M37221.m50730();
                        break;
                    }
                }
                this.f68341 += jMo33964;
                inputStreamMo33970.close();
                hashSet.add(strM51888);
                c14559 = c14558;
                it2 = it3;
                c21123 = c21124;
                abstractC20745M15313 = abstractC20745;
                i3 = i;
                abstractC16051 = abstractC16052;
                c22918M37220 = c22918;
                size = i2;
            } catch (Throwable th) {
                if (inputStreamMo33970 == null) {
                    throw th;
                }
                try {
                    inputStreamMo33970.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        AbstractC16051 abstractC16053 = abstractC16051;
        final AbstractC20745 abstractC20746 = abstractC20745M15313;
        C14558 c145510 = c14559;
        C22918 c22919 = c22918M37220;
        if (this.f68338.m5824()) {
            return;
        }
        C22918 c22918M37222 = this.f68347.m37220();
        C7583 c7583 = new C7583(this, C19808.m45032(this.f68344));
        int i7 = 0;
        for (C12107 c121010 : this.f68344) {
            if (this.f68338.m5824()) {
                break;
            }
            i7++;
            if (hashSet.contains(c121010.getName())) {
                if (!c121010.isDirectory()) {
                    this.f68339 = c121010.m30138() + this.f68339;
                }
            } else {
                this.f68338.m45592(C16737.m39288(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i7 + "/" + this.f68344.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                this.f68338.m45588(c121010.getName());
                if (c121010.isDirectory()) {
                    c22918M37222.m50727(c121010);
                } else {
                    C19808.m45039(c121010, this.f68340, c22918M37222, c7583);
                    this.f68339 = c121010.m30138() + this.f68339;
                }
            }
        }
        if (this.f68338.m5824()) {
            return;
        }
        c22919.close();
        if (c145510 != null) {
            C11005.m27755(abstractC16053.f51937.m28824(), this.f68347, c145510, this.f68338);
        }
        C19016.m43740(abstractC20746);
        C5222 c5222 = new C5222();
        c5222.m14408(abstractC20746);
        this.f68347.m37219(abstractC20746, new Runnable() { // from class: l.ۤܽ֨
            @Override // java.lang.Runnable
            public final void run() {
                C20989 c20989 = this.f35586;
                c20989.f68338.m45586(R.string.MT_Protector);
                c20989.f68338.m45588(abstractC20746.getName());
            }
        }, this.f68340);
        c5222.m14402(abstractC20746);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        boolean zM5824 = this.f68338.m5824();
        AbstractC16051 abstractC16051 = this.f68342;
        if (!zM5824) {
            abstractC16051.f51937.m28831();
            ArrayList arrayList = new ArrayList(((ArrayList) abstractC16051.f51939).size());
            Iterator it = ((ArrayList) abstractC16051.f51939).iterator();
            while (it.hasNext()) {
                arrayList.add(((C23540) it.next()).m51883());
            }
            abstractC16051.f51937.m28777((Collection) arrayList);
            abstractC16051.f51937.m28830();
            C6172 c6172 = (C6172) abstractC16051;
            Iterator it2 = c6172.f21027.iterator();
            while (it2.hasNext()) {
                ((C23540) it2.next()).m51889();
            }
            c6172.f21030.f45583 = false;
            return;
        }
        C15575 c15575 = this.f68347;
        if (c15575 != null) {
            C19431.m44468(c15575.m37220());
            this.f68347.m37218().mo24647();
        }
        abstractC16051.mo17179();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C15575 c15575 = this.f68347;
        if (c15575 != null) {
            C19431.m44468(c15575.m37220());
            this.f68347.m37218().mo24647();
        }
        C15829.m37619(exc.toString());
        this.f68342.mo17179();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C19431.m44468(this.f68340);
        this.f68338.m5825();
        C21094.m47530();
    }
}
