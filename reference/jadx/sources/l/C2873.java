package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: JAK2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2873 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f10839;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4760 f10840;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10841;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14558 f10842;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2455 f10843;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15575 f10844;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f10845;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10846;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC22400 f10847;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f10848;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f10849;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C20164 f10850;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f10851;

    public C2873(C4760 c4760, C14558 c14558, boolean z, HashSet hashSet, ArrayList arrayList, boolean z2, long j, HashSet hashSet2, RunnableC22400 runnableC22400) {
        this.f10840 = c4760;
        this.f10842 = c14558;
        this.f10846 = z;
        this.f10849 = hashSet;
        this.f10845 = arrayList;
        this.f10841 = z2;
        this.f10848 = j;
        this.f10851 = hashSet2;
        this.f10847 = runnableC22400;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C20164 c20164 = new C20164(this.f10840.f16771.m28824());
        c20164.m45586(R.string.MT_Protector);
        c20164.m45588("...");
        c20164.mo5828((Runnable) null);
        c20164.m45600();
        this.f10850 = c20164;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        C4760 c4760 = this.f10840;
        this.f10843 = new C2455(c4760.f16770);
        AbstractC20745 abstractC20745 = c4760.f16770;
        C14558 c14558 = this.f10842;
        C15575 c15575M45035 = C19808.m45035(abstractC20745, c14558 != null);
        this.f10844 = c15575M45035;
        C22918 c22918M37220 = c15575M45035.m37220();
        if (c14558 == null && this.f10846 && this.f10843.m7488()) {
            c22918M37220.m50726(this.f10843);
        }
        if (this.f10843.m7482()) {
            c22918M37220.m50718();
        }
        Collection collectionM7466 = this.f10843.m7466();
        C9225 c9225 = new C9225(this, C19808.m45032(collectionM7466));
        Iterator it = collectionM7466.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            HashSet hashSet = this.f10851;
            boolean z = this.f10841;
            long j = this.f10848;
            ArrayList arrayList = this.f10845;
            if (zHasNext) {
                C12107 c12107 = (C12107) it.next();
                if (this.f10850.m5824()) {
                    return;
                }
                if (!this.f10849.contains(c12107.getName())) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String str = (String) it2.next();
                            if (z) {
                                if (c12107.getName().startsWith(str)) {
                                    c12107.setTime(j);
                                    if (c12107.isDirectory()) {
                                        hashSet.add(c12107.getName());
                                    }
                                }
                            } else if (c12107.getName().equals(str)) {
                                c12107.setTime(j);
                                if (c12107.isDirectory()) {
                                    hashSet.add(c12107.getName());
                                }
                            }
                        }
                    }
                } else {
                    c12107.setTime(j);
                    if (c12107.isDirectory()) {
                        hashSet.add(c12107.getName());
                    }
                }
                i++;
                this.f10850.m45592(C16737.m39288(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i + "/" + collectionM7466.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                this.f10850.m45588(c12107.getName());
                if (c12107.isDirectory()) {
                    c22918M37220.m50727(c12107);
                } else {
                    C19808.m45039(c12107, this.f10843, c22918M37220, c9225);
                    this.f10839 = c12107.m30138() + this.f10839;
                }
            } else {
                C23730.m52264(true);
                if (arrayList.contains("META-INF/")) {
                    C23730.m52262(new C14164(j));
                }
                if (!z) {
                    arrayList.removeAll(hashSet);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C12107 c12108 = new C12107((String) it3.next());
                        c12108.setTime(j);
                        c22918M37220.m50727(c12108);
                    }
                }
                this.f10850.m45591(100);
                this.f10850.m45599(100);
                c22918M37220.close();
                if (c14558 != null) {
                    C11005.m27755(c4760.f16771.m28824(), this.f10844, c14558, this.f10850);
                }
                C19016.m43740(c4760.f16770);
                C5222 c5222 = new C5222();
                c5222.m14408(c4760.f16770);
                this.f10844.m37219(c4760.f16770, new Runnable() { // from class: l.֫֡֨
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2873 c2873 = this.f5958;
                        c2873.f10850.m45586(R.string.MT_Protector);
                        c2873.f10850.m45588(c2873.f10840.f16770.getName());
                    }
                }, this.f10843);
                c5222.m14402(c4760.f16770);
                return;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (!this.f10850.m5824()) {
            this.f10840.f16771.m28830();
            this.f10847.run();
            return;
        }
        C15575 c15575 = this.f10844;
        if (c15575 != null) {
            C19431.m44468(c15575.m37220());
            this.f10844.m37218().mo24647();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C15575 c15575 = this.f10844;
        if (c15575 != null) {
            C19431.m44468(c15575.m37220());
            this.f10844.m37218().mo24647();
        }
        this.f10840.f16771.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C23730.m52264(false);
        C23730.m52262((C14164) null);
        this.f10850.m5825();
        C19431.m44468(this.f10843);
        C21094.m47530();
    }
}
