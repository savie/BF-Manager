package l;

import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۧᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4917 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11189 extends AbstractC22936 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f37890;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10484 f37891;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Integer f37892;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f37893;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f37894;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f37895;

    public C11189(ArrayList arrayList, C11647 c11647) {
        Integer numValueOf = Integer.valueOf(BasicLabelFormatter.MILLION);
        this.f37891 = new C10484();
        ArrayList arrayList2 = new ArrayList();
        this.f37895 = arrayList2;
        this.f37893 = 0;
        this.f37894 = true;
        this.f37890 = arrayList;
        arrayList2.add(c11647);
        this.f37892 = numValueOf;
    }

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean mo28131() {
        return this.f37894;
    }

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC14738 mo1823() {
        return this.f37891;
    }

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ */
    public final C22168 mo1821(InterfaceC8119 interfaceC8119) {
        CharSequence charSequenceM29102 = interfaceC8119.getLine().m29102();
        int iM50576 = C22851.m50576('|', charSequenceM29102, interfaceC8119.mo21197());
        if (iM50576 == -1) {
            return null;
        }
        if (iM50576 == interfaceC8119.mo21197() && C22851.m50577(iM50576 + 1, charSequenceM29102.length(), charSequenceM29102) == charSequenceM29102.length()) {
            this.f37894 = false;
            return null;
        }
        return C22168.m49178(interfaceC8119.getIndex());
    }

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ */
    public final void mo1822(C11647 c11647) {
        this.f37895.add(c11647);
    }

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ */
    public final void mo19625(InterfaceC14429 interfaceC14429) {
        C10484 c10484 = this.f37891;
        List listM44394 = c10484.m44394();
        C0316 c0316 = !listM44394.isEmpty() ? (C0316) listM44394.get(0) : null;
        C20361 c20361 = new C20361();
        if (c0316 != null) {
            c20361.m44385(c0316);
        }
        c10484.m44388(c20361);
        C0604 c0604 = new C0604();
        c0604.m44384(c20361.m44394());
        c20361.m44388(c0604);
        ArrayList arrayList = this.f37895;
        ArrayList arrayListM28129 = m28129((C11647) arrayList.get(0));
        int size = arrayListM28129.size();
        for (int i = 0; i < size; i++) {
            C16128 c16128M28128 = m28128((C11647) arrayListM28129.get(i), i, interfaceC14429);
            c16128M28128.m38181();
            c0604.m44388(c16128M28128);
        }
        int i2 = 2;
        C7661 c7661 = null;
        while (i2 < arrayList.size()) {
            C11647 c11647 = (C11647) arrayList.get(i2);
            C0316 c0317 = i2 < listM44394.size() ? (C0316) listM44394.get(i2) : null;
            ArrayList arrayListM281210 = m28129(c11647);
            C0604 c0605 = new C0604();
            if (c0317 != null) {
                c0605.m44385(c0317);
            }
            int i3 = 0;
            while (i3 < size) {
                c0605.m44388(m28128(i3 < arrayListM281210.size() ? (C11647) arrayListM281210.get(i3) : C11647.m29101("", (C0316) null), i3, interfaceC14429));
                i3++;
            }
            if (c7661 == null) {
                c7661 = new C7661();
                c10484.m44388(c7661);
            }
            c7661.m44388(c0605);
            c7661.m44385(c0317);
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C16128 m28128(C11647 c11647, int i, InterfaceC14429 interfaceC14429) {
        Integer num = this.f37892;
        if (num != null) {
            if (this.f37893 >= num.intValue()) {
                throw new IllegalArgumentException("Aborting parsing because maximum number of cells reached (maxCells = " + num + MotionUtils.EASING_TYPE_FORMAT_END);
            }
            this.f37893++;
        }
        C16128 c16128 = new C16128();
        C0316 c0316M29104 = c11647.m29104();
        if (c0316M29104 != null) {
            c16128.m44385(c0316M29104);
        }
        ArrayList arrayList = this.f37890;
        if (i < arrayList.size()) {
            c16128.m38179(((C6249) arrayList.get(i)).m17318());
        }
        CharSequence charSequenceM29102 = c11647.m29102();
        int iM50577 = C22851.m50577(0, charSequenceM29102.length(), charSequenceM29102);
        C11647 c11647M29103 = c11647.m29103(iM50577, C22851.m50589(charSequenceM29102.length() - 1, iM50577, charSequenceM29102) + 1);
        C2473 c2473 = new C2473();
        c2473.m7584(c11647M29103);
        interfaceC14429.mo5680(c2473, c16128);
        return c16128;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m28129(C11647 c11647) {
        CharSequence charSequenceM29102 = c11647.m29102();
        int iM50577 = C22851.m50577(0, charSequenceM29102.length(), charSequenceM29102);
        int length = charSequenceM29102.length();
        if (charSequenceM29102.charAt(iM50577) == '|') {
            iM50577++;
            length = C22851.m50589(charSequenceM29102.length() - 1, iM50577, charSequenceM29102) + 1;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = iM50577;
        while (iM50577 < length) {
            char cCharAt = charSequenceM29102.charAt(iM50577);
            if (cCharAt == '\\') {
                int i2 = iM50577 + 1;
                if (i2 < length && charSequenceM29102.charAt(i2) == '|') {
                    sb.append('|');
                    iM50577 = i2;
                } else {
                    sb.append('\\');
                }
            } else if (cCharAt == '|') {
                arrayList.add(C11647.m29101(sb.toString(), c11647.m29103(i, iM50577).m29104()));
                sb.setLength(0);
                i = iM50577 + 1;
            } else {
                sb.append(cCharAt);
            }
            iM50577++;
        }
        if (sb.length() > 0) {
            arrayList.add(C11647.m29101(sb.toString(), c11647.m29103(i, c11647.m29102().length()).m29104()));
        }
        return arrayList;
    }
}
