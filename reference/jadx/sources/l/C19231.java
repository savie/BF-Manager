package l;

import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.AdapterView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩵ۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19231 implements InterfaceC19517, AdapterView.OnItemClickListener, InterfaceC15887 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f62159;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f62160;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f62161;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2233 f62162;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f62163;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f62164;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String[] f62165;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7236 f62166;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f62167;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f62168;

    public C19231(C7236 c7236) {
        this.f62166 = c7236;
        this.f62165 = c7236.m19346().split("/");
        C2233 c2233 = new C2233(c7236.requireContext(), 255);
        this.f62162 = c2233;
        c2233.m6863(this);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.START;
        c2233.m6867();
        c7236.f24106.m16875((InterfaceC15887) this);
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
    @Override // l.InterfaceC19517
    /* JADX INFO: renamed from: ۙ */
    public final void mo5518(ArrayList arrayList) {
        int i;
        int iM19291;
        int iM19290;
        int iM19292;
        C8648 c8648;
        String strM22450;
        C7236 c7236 = this.f62166;
        c7236.f24106.m16858(arrayList);
        int iM16916 = c7236.f24106.m16916();
        int iM17020 = c7236.f24106.m17020();
        if (iM16916 > iM17020) {
            iM17020 = iM16916;
            iM16916 = iM17020;
        }
        C3329 c3329Mo2399 = c7236.f24106.m17000().mo2399();
        if (iM16916 != iM17020) {
            try {
                if (TextUtils.indexOf((CharSequence) c3329Mo2399, '\n', iM16916, iM17020) == -1) {
                    i = iM16916 - 1;
                    iM19291 = C7236.m19291(c3329Mo2399, i, true);
                    int iM19293 = C7236.m19291(c3329Mo2399, iM17020, false);
                    if (iM19291 == -1 && iM19293 != -1) {
                        int i2 = iM19291 + 1;
                        this.f62163 = i2;
                        this.f62168 = iM19293;
                        this.f62161 = c3329Mo2399.subSequence(i2, iM19293);
                        if (m44191()) {
                            this.f62167 = false;
                            m44190(arrayList);
                        }
                    } else {
                        iM19290 = C7236.m19290(i, (CharSequence) c3329Mo2399, true);
                        iM19292 = C7236.m19290(iM17020, (CharSequence) c3329Mo2399, false);
                        if (iM19290 == -1 && iM19292 != -1 && C7236.m19302(iM19290 - 1, c3329Mo2399)) {
                            int i3 = iM19290 + 1;
                            this.f62163 = i3;
                            this.f62168 = iM19292;
                            this.f62161 = c3329Mo2399.subSequence(i3, iM19292);
                            if (c7236.f24118 != null) {
                                arrayList.add(new C16221(R.string.menu_copy_id, R.drawable.MT_Protector, new InterfaceC17295() { // from class: l.ᩳۙۜ
                                    @Override // l.InterfaceC17295
                                    public final void accept(Object obj) {
                                        C19231.m44188(this.f56452);
                                    }
                                }));
                            }
                            this.f62159 = "";
                            this.f62160 = this.f62165[1];
                            this.f62164 = this.f62161;
                            this.f62167 = true;
                            m44190(arrayList);
                        } else if (iM19290 != -1 && iM19292 != -1) {
                            c8648 = new C8648(iM19290 - 1, c3329Mo2399);
                            strM22450 = c8648.m22450();
                            if (strM22450.equals("=")) {
                                strM22450 = c8648.m22450() + strM22450;
                            }
                            if (strM22450.equals("parent=")) {
                                int i4 = iM19290 + 1;
                                this.f62163 = i4;
                                this.f62168 = iM19292;
                                this.f62161 = c3329Mo2399.subSequence(i4, iM19292);
                                if (m44191()) {
                                    this.f62167 = false;
                                    m44190(arrayList);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    c3329Mo2399.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            i = iM16916 - 1;
            iM19291 = C7236.m19291(c3329Mo2399, i, true);
            int iM19294 = C7236.m19291(c3329Mo2399, iM17020, false);
            if (iM19291 == -1) {
                iM19290 = C7236.m19290(i, (CharSequence) c3329Mo2399, true);
                iM19292 = C7236.m19290(iM17020, (CharSequence) c3329Mo2399, false);
                if (iM19290 == -1) {
                    if (iM19290 != -1) {
                        c8648 = new C8648(iM19290 - 1, c3329Mo2399);
                        strM22450 = c8648.m22450();
                        if (strM22450.equals("=")) {
                            strM22450 = c8648.m22450() + strM22450;
                        }
                        if (strM22450.equals("parent=")) {
                            int i5 = iM19290 + 1;
                            this.f62163 = i5;
                            this.f62168 = iM19292;
                            this.f62161 = c3329Mo2399.subSequence(i5, iM19292);
                            if (m44191()) {
                                this.f62167 = false;
                                m44190(arrayList);
                            }
                        }
                    }
                } else if (iM19290 != -1) {
                    c8648 = new C8648(iM19290 - 1, c3329Mo2399);
                    strM22450 = c8648.m22450();
                    if (strM22450.equals("=")) {
                        strM22450 = c8648.m22450() + strM22450;
                    }
                    if (strM22450.equals("parent=")) {
                        int i6 = iM19290 + 1;
                        this.f62163 = i6;
                        this.f62168 = iM19292;
                        this.f62161 = c3329Mo2399.subSequence(i6, iM19292);
                        if (m44191()) {
                            this.f62167 = false;
                            m44190(arrayList);
                        }
                    }
                }
            } else {
                iM19290 = C7236.m19290(i, (CharSequence) c3329Mo2399, true);
                iM19292 = C7236.m19290(iM17020, (CharSequence) c3329Mo2399, false);
                if (iM19290 == -1) {
                    if (iM19290 != -1) {
                        c8648 = new C8648(iM19290 - 1, c3329Mo2399);
                        strM22450 = c8648.m22450();
                        if (strM22450.equals("=")) {
                            strM22450 = c8648.m22450() + strM22450;
                        }
                        if (strM22450.equals("parent=")) {
                            int i7 = iM19290 + 1;
                            this.f62163 = i7;
                            this.f62168 = iM19292;
                            this.f62161 = c3329Mo2399.subSequence(i7, iM19292);
                            if (m44191()) {
                                this.f62167 = false;
                                m44190(arrayList);
                            }
                        }
                    }
                } else if (iM19290 != -1) {
                    c8648 = new C8648(iM19290 - 1, c3329Mo2399);
                    strM22450 = c8648.m22450();
                    if (strM22450.equals("=")) {
                        strM22450 = c8648.m22450() + strM22450;
                    }
                    if (strM22450.equals("parent=")) {
                        int i8 = iM19290 + 1;
                        this.f62163 = i8;
                        this.f62168 = iM19292;
                        this.f62161 = c3329Mo2399.subSequence(i8, iM19292);
                        if (m44191()) {
                            this.f62167 = false;
                            m44190(arrayList);
                        }
                    }
                }
            }
        }
        c3329Mo2399.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44188(C19231 c19231) {
        C7236 c7236 = c19231.f62166;
        if (c7236.f24116) {
            String strM19293 = C7236.m19293(c7236, c19231.f62161);
            if (strM19293 != null) {
                C16737.m39266(-1, strM19293);
                C15829 c15829M37612 = C15829.m37612(0, strM19293);
                c15829M37612.m37621(17, 0);
                c15829M37612.m37622();
                return;
            }
            ((ActivityC5677) c7236.requireActivity()).m15674(c7236.f24118, (C8500) null);
            C15829 c15829M37613 = C15829.m37612(1, c7236.getString(R.string.MT_Protector, c19231.f62161));
            c15829M37613.m37621(17, 0);
            c15829M37613.m37622();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m44191() {
        if ((this.f62161.startsWith("@") || this.f62161.startsWith("?")) && this.f62161.indexOf(32) == -1) {
            String[] strArrSplit = this.f62161.substring(1).split("/");
            if (strArrSplit.length == 2) {
                String str = strArrSplit[0];
                this.f62164 = strArrSplit[1];
                if (str.indexOf(58) != -1) {
                    String[] strArrSplit2 = str.split(":");
                    if (strArrSplit2.length != 2) {
                        return false;
                    }
                    this.f62159 = strArrSplit2[0];
                    this.f62160 = strArrSplit2[1];
                } else {
                    this.f62159 = "";
                    this.f62160 = str;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [l.ᩴۙۜ] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m44190(ArrayList arrayList) {
        if (this.f62165.length != 3) {
            return;
        }
        C7236 c7236 = this.f62166;
        C4555 c4555M17026 = c7236.f24106.m17026();
        c4555M17026.f16178 = true;
        c4555M17026.f16179 = this.f62163;
        c4555M17026.f16180 = this.f62168;
        c7236.f24106.invalidate();
        arrayList.add(new C7942(this, new InterfaceC17295() { // from class: l.ᩴۙۜ
            @Override // l.InterfaceC17295
            public final void accept(Object obj) {
                C19231.m44189(this.f58987, (C6111) obj);
            }
        }, c4555M17026));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44189(C19231 c19231, C6111 c6111) {
        String strConcat;
        C2233 c2233 = c19231.f62162;
        C7236 c7236 = c19231.f62166;
        if (c7236.f24116) {
            if (TextUtils.isEmpty(c19231.f62159)) {
                strConcat = C22697.m50267(new StringBuilder(), c19231.f62165[0], "/");
            } else {
                String strM21590 = c7236.f24113.m21590(c19231.f62159);
                if (strM21590 == null) {
                    c7236.f24104.m42627((Throwable) new C4987("Resource not found: " + c19231.f62161));
                    return;
                }
                strConcat = strM21590.concat("/");
            }
            ArrayList<C21634> arrayListM21595 = c7236.f24113.m21595(C22697.m50267(C9023.m23356(strConcat), c19231.f62160, "/"), c19231.f62164);
            if (arrayListM21595.isEmpty()) {
                c7236.f24104.m42627((Throwable) new C4987("Resource not found: " + c19231.f62161));
                return;
            }
            if (c19231.f62167) {
                String strM19346 = c7236.m19346();
                for (C21634 c21634 : arrayListM21595) {
                    if (c21634.f70160.equals(strM19346)) {
                        c21634.setSpan(new ForegroundColorSpan(C20368.f65970), 0, strM19346.length(), 33);
                        break;
                    }
                }
            }
            Collections.sort(arrayListM21595);
            c2233.m6864(arrayListM21595);
            c2233.m6865(c6111, c6111.m16916());
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C2233 c2233 = this.f62162;
        c2233.m6862();
        C21634 c21634 = (C21634) c2233.m6861(i);
        C7236 c7236 = this.f62166;
        c7236.f24106.m16934();
        ((ActivityC5677) c7236.requireActivity()).m15674(c21634.f70160, c21634.f70161);
    }

    @Override // l.InterfaceC15887
    /* JADX INFO: renamed from: ۙ */
    public final void mo30239() {
        this.f62162.m6862();
    }
}
