package l;

import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.AdapterView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۚ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5958 implements InterfaceC5486, AdapterView.OnItemClickListener, InterfaceC1076 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String[] f20394;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f20395;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f20396;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C1380 f20397;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f20398;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f20399;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f20400;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f20401;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25350 f20402;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f20403;

    public C5958(C25350 c25350) {
        this.f20402 = c25350;
        this.f20394 = c25350.m56683().split("/");
        C1380 c1380 = new C1380(c25350.requireContext(), 255);
        this.f20397 = c1380;
        c1380.m5066(this);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.START;
        c1380.m5071();
        c25350.f81832.m53905((InterfaceC1076) this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035 A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:8:0x002f, B:10:0x0035, B:13:0x0044, B:15:0x0055, B:16:0x005c, B:19:0x0068, B:21:0x0070, B:23:0x0081, B:24:0x0094, B:27:0x00ac, B:29:0x00bf, B:30:0x00d2, B:32:0x00da, B:34:0x00eb), top: B:43:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:16:0x005c A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:8:0x002f, B:10:0x0035, B:13:0x0044, B:15:0x0055, B:16:0x005c, B:19:0x0068, B:21:0x0070, B:23:0x0081, B:24:0x0094, B:27:0x00ac, B:29:0x00bf, B:30:0x00d2, B:32:0x00da, B:34:0x00eb), top: B:43:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bf A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:8:0x002f, B:10:0x0035, B:13:0x0044, B:15:0x0055, B:16:0x005c, B:19:0x0068, B:21:0x0070, B:23:0x0081, B:24:0x0094, B:27:0x00ac, B:29:0x00bf, B:30:0x00d2, B:32:0x00da, B:34:0x00eb), top: B:43:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00da A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:8:0x002f, B:10:0x0035, B:13:0x0044, B:15:0x0055, B:16:0x005c, B:19:0x0068, B:21:0x0070, B:23:0x0081, B:24:0x0094, B:27:0x00ac, B:29:0x00bf, B:30:0x00d2, B:32:0x00da, B:34:0x00eb), top: B:43:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {all -> 0x00f4, blocks: (B:8:0x002f, B:10:0x0035, B:13:0x0044, B:15:0x0055, B:16:0x005c, B:19:0x0068, B:21:0x0070, B:23:0x0081, B:24:0x0094, B:27:0x00ac, B:29:0x00bf, B:30:0x00d2, B:32:0x00da, B:34:0x00eb), top: B:43:0x002f }] */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x00bf, please report this as an issue */
    @Override // l.InterfaceC5486
    /* JADX INFO: renamed from: ۙ */
    public final void mo6299(ArrayList arrayList) {
        int i;
        int iM56629;
        int iM56628;
        int iM566210;
        C2229 c2229;
        String strM7619;
        C25350 c25350 = this.f20402;
        c25350.f81832.mo52301(arrayList);
        int iM53968 = c25350.f81832.m53968();
        int iM53882 = c25350.f81832.m53882();
        if (iM53968 > iM53882) {
            iM53882 = iM53968;
            iM53968 = iM53882;
        }
        C15508 c15508Mo15350 = c25350.f81832.m54021().mo15350();
        if (iM53968 != iM53882) {
            try {
                if (TextUtils.indexOf((CharSequence) c15508Mo15350, '\n', iM53968, iM53882) == -1) {
                    i = iM53968 - 1;
                    iM56629 = C25350.m56629(c15508Mo15350, i, true);
                    int iM566211 = C25350.m56629(c15508Mo15350, iM53882, false);
                    if (iM56629 == -1 && iM566211 != -1) {
                        int i2 = iM56629 + 1;
                        this.f20396 = i2;
                        this.f20398 = iM566211;
                        this.f20395 = c15508Mo15350.subSequence(i2, iM566211);
                        if (m17340()) {
                            this.f20403 = false;
                            m17339(arrayList);
                        }
                    } else {
                        iM56628 = C25350.m56628((CharSequence) c15508Mo15350, i, true);
                        iM566210 = C25350.m56628((CharSequence) c15508Mo15350, iM53882, false);
                        if (iM56628 == -1 && iM566210 != -1 && C25350.m56640(iM56628 - 1, c15508Mo15350)) {
                            int i3 = iM56628 + 1;
                            this.f20396 = i3;
                            this.f20398 = iM566210;
                            this.f20395 = c15508Mo15350.subSequence(i3, iM566210);
                            if (c25350.f81850 != null) {
                                arrayList.add(new C17372(R.string.menu_copy_id, R.drawable.MT_Protector, new InterfaceC0818() { // from class: l.ᩴ᩹ۧ
                                    @Override // l.InterfaceC0818
                                    public final void accept(Object obj) {
                                        C5958.m17337(this.f64688);
                                    }
                                }));
                            }
                            this.f20401 = "";
                            this.f20399 = this.f20394[1];
                            this.f20400 = this.f20395;
                            this.f20403 = true;
                            m17339(arrayList);
                        } else if (iM56628 != -1 && iM566210 != -1) {
                            c2229 = new C2229(iM56628 - 1, c15508Mo15350);
                            strM7619 = c2229.m7619();
                            if (strM7619.equals("=")) {
                                strM7619 = c2229.m7619() + strM7619;
                            }
                            if (strM7619.equals("parent=")) {
                                int i4 = iM56628 + 1;
                                this.f20396 = i4;
                                this.f20398 = iM566210;
                                this.f20395 = c15508Mo15350.subSequence(i4, iM566210);
                                if (m17340()) {
                                    this.f20403 = false;
                                    m17339(arrayList);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    c15508Mo15350.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            i = iM53968 - 1;
            iM56629 = C25350.m56629(c15508Mo15350, i, true);
            int iM566212 = C25350.m56629(c15508Mo15350, iM53882, false);
            if (iM56629 == -1) {
                iM56628 = C25350.m56628((CharSequence) c15508Mo15350, i, true);
                iM566210 = C25350.m56628((CharSequence) c15508Mo15350, iM53882, false);
                if (iM56628 == -1) {
                    if (iM56628 != -1) {
                        c2229 = new C2229(iM56628 - 1, c15508Mo15350);
                        strM7619 = c2229.m7619();
                        if (strM7619.equals("=")) {
                            strM7619 = c2229.m7619() + strM7619;
                        }
                        if (strM7619.equals("parent=")) {
                            int i5 = iM56628 + 1;
                            this.f20396 = i5;
                            this.f20398 = iM566210;
                            this.f20395 = c15508Mo15350.subSequence(i5, iM566210);
                            if (m17340()) {
                                this.f20403 = false;
                                m17339(arrayList);
                            }
                        }
                    }
                } else if (iM56628 != -1) {
                    c2229 = new C2229(iM56628 - 1, c15508Mo15350);
                    strM7619 = c2229.m7619();
                    if (strM7619.equals("=")) {
                        strM7619 = c2229.m7619() + strM7619;
                    }
                    if (strM7619.equals("parent=")) {
                        int i6 = iM56628 + 1;
                        this.f20396 = i6;
                        this.f20398 = iM566210;
                        this.f20395 = c15508Mo15350.subSequence(i6, iM566210);
                        if (m17340()) {
                            this.f20403 = false;
                            m17339(arrayList);
                        }
                    }
                }
            } else {
                iM56628 = C25350.m56628((CharSequence) c15508Mo15350, i, true);
                iM566210 = C25350.m56628((CharSequence) c15508Mo15350, iM53882, false);
                if (iM56628 == -1) {
                    if (iM56628 != -1) {
                        c2229 = new C2229(iM56628 - 1, c15508Mo15350);
                        strM7619 = c2229.m7619();
                        if (strM7619.equals("=")) {
                            strM7619 = c2229.m7619() + strM7619;
                        }
                        if (strM7619.equals("parent=")) {
                            int i7 = iM56628 + 1;
                            this.f20396 = i7;
                            this.f20398 = iM566210;
                            this.f20395 = c15508Mo15350.subSequence(i7, iM566210);
                            if (m17340()) {
                                this.f20403 = false;
                                m17339(arrayList);
                            }
                        }
                    }
                } else if (iM56628 != -1) {
                    c2229 = new C2229(iM56628 - 1, c15508Mo15350);
                    strM7619 = c2229.m7619();
                    if (strM7619.equals("=")) {
                        strM7619 = c2229.m7619() + strM7619;
                    }
                    if (strM7619.equals("parent=")) {
                        int i8 = iM56628 + 1;
                        this.f20396 = i8;
                        this.f20398 = iM566210;
                        this.f20395 = c15508Mo15350.subSequence(i8, iM566210);
                        if (m17340()) {
                            this.f20403 = false;
                            m17339(arrayList);
                        }
                    }
                }
            }
        }
        c15508Mo15350.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17337(C5958 c5958) {
        C25350 c25350 = c5958.f20402;
        if (c25350.f81856) {
            String strM56631 = C25350.m56631(c25350, c5958.f20395);
            if (strM56631 != null) {
                C21576.m49061(-1, strM56631);
                C22673 c22673M51153 = C22673.m51153(0, strM56631);
                c22673M51153.m51162(17, 0);
                c22673M51153.m51163();
                return;
            }
            ((ActivityC0848) c25350.requireActivity()).m3452(c25350.f81850, (C15301) null);
            C22673 c22673M51154 = C22673.m51153(1, c25350.getString(R.string.MT_Protector, c5958.f20395));
            c22673M51154.m51162(17, 0);
            c22673M51154.m51163();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m17340() {
        if ((this.f20395.startsWith("@") || this.f20395.startsWith("?")) && this.f20395.indexOf(32) == -1) {
            String[] strArrSplit = this.f20395.substring(1).split("/");
            if (strArrSplit.length == 2) {
                String str = strArrSplit[0];
                this.f20400 = strArrSplit[1];
                if (str.indexOf(58) != -1) {
                    String[] strArrSplit2 = str.split(":");
                    if (strArrSplit2.length != 2) {
                        return false;
                    }
                    this.f20401 = strArrSplit2[0];
                    this.f20399 = strArrSplit2[1];
                } else {
                    this.f20401 = "";
                    this.f20399 = str;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [l.ܳ᩹ۧ] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m17339(ArrayList arrayList) {
        if (this.f20394.length != 3) {
            return;
        }
        C25350 c25350 = this.f20402;
        C10155 c10155M54061 = c25350.f81832.m54061();
        c10155M54061.f32517 = true;
        c10155M54061.f32518 = this.f20396;
        c10155M54061.f32519 = this.f20398;
        c25350.f81832.invalidate();
        arrayList.add(new C13415(this, new InterfaceC0818() { // from class: l.ܳ᩹ۧ
            @Override // l.InterfaceC0818
            public final void accept(Object obj) {
                C5958.m17338(this.f50869, (C24132) obj);
            }
        }, c10155M54061));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17338(C5958 c5958, C24132 c24132) {
        String strConcat;
        C1380 c1380 = c5958.f20397;
        C25350 c25350 = c5958.f20402;
        if (c25350.f81856) {
            if (TextUtils.isEmpty(c5958.f20401)) {
                strConcat = C8947.m23910(new StringBuilder(), c5958.f20394[0], "/");
            } else {
                String strM30000 = c25350.f81831.m30000(c5958.f20401);
                if (strM30000 == null) {
                    c25350.f81835.m51299(new C4866("Resource not found: " + c5958.f20395));
                    return;
                }
                strConcat = strM30000.concat("/");
            }
            ArrayList<C13459> arrayListM29989 = c25350.f81831.m29989(C8947.m23910(C10732.m27333(strConcat), c5958.f20399, "/"), c5958.f20400);
            if (arrayListM29989.isEmpty()) {
                c25350.f81835.m51299(new C4866("Resource not found: " + c5958.f20395));
                return;
            }
            if (c5958.f20403) {
                String strM56683 = c25350.m56683();
                for (C13459 c13459 : arrayListM29989) {
                    if (c13459.f42843.equals(strM56683)) {
                        c13459.setSpan(new ForegroundColorSpan(C3296.f10738), 0, strM56683.length(), 33);
                        break;
                    }
                }
            }
            Collections.sort(arrayListM29989);
            c1380.m5067(arrayListM29989);
            c1380.m5069(c24132, c24132.m53968());
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C1380 c1380 = this.f20397;
        c1380.m5065();
        C13459 c13459 = (C13459) c1380.m5064(i);
        C25350 c25350 = this.f20402;
        c25350.f81832.m54044();
        ((ActivityC0848) c25350.requireActivity()).m3452(c13459.f42843, c13459.f42842);
    }

    @Override // l.InterfaceC1076
    /* JADX INFO: renamed from: ۙ */
    public final void mo4037() {
        this.f20397.m5065();
    }
}
