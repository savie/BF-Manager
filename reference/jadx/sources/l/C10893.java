package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ۬۫, reason: contains not printable characters */
/* JADX INFO: compiled from: JAK2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10893 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22828 f34474;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9651 f34475;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C7715 f34476;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f34477;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22941 f34478;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f34479;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10043 f34480;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f34481;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f34482;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f34483;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f34484;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC1945 f34485;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f34486;

    public C10893(C22828 c22828, C9651 c9651, boolean z, HashSet hashSet, ArrayList arrayList, boolean z2, long j, HashSet hashSet2, RunnableC1945 runnableC1945) {
        this.f34474 = c22828;
        this.f34475 = c9651;
        this.f34481 = z;
        this.f34483 = hashSet;
        this.f34482 = arrayList;
        this.f34477 = z2;
        this.f34484 = j;
        this.f34486 = hashSet2;
        this.f34485 = runnableC1945;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10043 c10043 = new C10043(this.f34474.f73985.m23233());
        c10043.m25920(R.string.MT_Protector);
        c10043.m25929("...");
        c10043.mo25916((Runnable) null);
        c10043.m25932();
        this.f34480 = c10043;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        C22828 c22828 = this.f34474;
        this.f34478 = new C22941(c22828.f73987);
        AbstractC22044 abstractC22044 = c22828.f73987;
        C9651 c9651 = this.f34475;
        C7715 c7715M43873 = C18902.m43873(abstractC22044, c9651 != null);
        this.f34476 = c7715M43873;
        C25179 c25179M20996 = c7715M43873.m20996();
        if (c9651 == null && this.f34481 && this.f34478.m51726()) {
            c25179M20996.m56128(this.f34478);
        }
        if (this.f34478.m51736()) {
            c25179M20996.m56130();
        }
        Collection collectionM51742 = this.f34478.m51742();
        C22082 c22082 = new C22082(this, C18902.m43870(collectionM51742));
        Iterator it = collectionM51742.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            HashSet hashSet = this.f34486;
            boolean z = this.f34477;
            long j = this.f34484;
            ArrayList arrayList = this.f34482;
            if (zHasNext) {
                C8002 c8002 = (C8002) it.next();
                if (this.f34480.m27399()) {
                    return;
                }
                if (!this.f34483.contains(c8002.getName())) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String str = (String) it2.next();
                            if (z) {
                                if (c8002.getName().startsWith(str)) {
                                    c8002.setTime(j);
                                    if (c8002.isDirectory()) {
                                        hashSet.add(c8002.getName());
                                    }
                                }
                            } else if (c8002.getName().equals(str)) {
                                c8002.setTime(j);
                                if (c8002.isDirectory()) {
                                    hashSet.add(c8002.getName());
                                }
                            }
                        }
                    }
                } else {
                    c8002.setTime(j);
                    if (c8002.isDirectory()) {
                        hashSet.add(c8002.getName());
                    }
                }
                i++;
                this.f34480.m25926(C21576.m49088(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i + "/" + collectionM51742.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                this.f34480.m25929(c8002.getName());
                if (c8002.isDirectory()) {
                    c25179M20996.m56125(c8002);
                } else {
                    C18902.m43878(c8002, this.f34478, c25179M20996, c22082);
                    this.f34479 = c8002.m21838() + this.f34479;
                }
            } else {
                C1449.m5221(true);
                if (arrayList.contains("META-INF/")) {
                    C1449.m5218(new C13680(j));
                }
                if (!z) {
                    arrayList.removeAll(hashSet);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C8002 c8003 = new C8002((String) it3.next());
                        c8003.setTime(j);
                        c25179M20996.m56125(c8003);
                    }
                }
                this.f34480.m25925(100);
                this.f34480.m25921(100);
                c25179M20996.close();
                if (c9651 != null) {
                    C0938.m3743(c22828.f73985.m23233(), this.f34476, c9651, this.f34480);
                }
                C24808.m55331(c22828.f73987);
                C24523 c24523 = new C24523();
                c24523.m54796(c22828.f73987);
                this.f34476.m20995(c22828.f73987, new Runnable() { // from class: l.ۙ۬۫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10893 c10893 = this.f17187;
                        c10893.f34480.m25920(R.string.MT_Protector);
                        c10893.f34480.m25929(c10893.f34474.f73987.getName());
                    }
                }, this.f34478);
                c24523.m54797(c22828.f73987);
                return;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (!this.f34480.m27399()) {
            this.f34474.f73985.m23216();
            this.f34485.run();
            return;
        }
        C7715 c7715 = this.f34476;
        if (c7715 != null) {
            C20244.m46520(c7715.m20996());
            this.f34476.m20994().mo4296();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C7715 c7715 = this.f34476;
        if (c7715 != null) {
            C20244.m46520(c7715.m20996());
            this.f34476.m20994().mo4296();
        }
        this.f34474.f73985.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C1449.m5221(false);
        C1449.m5218((C13680) null);
        this.f34480.m27405();
        C20244.m46520(this.f34478);
        C6331.m18055();
    }
}
