package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۤܰۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BT */
/* JADX INFO: loaded from: classes4.dex */
public final class C10907 extends C15382 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Map f34535;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f34536;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f34537;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Map f34538;

    @Override // l.C15382, l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ InterfaceC3145 mo10271(String str) {
        m27681(str);
        return this;
    }

    @Override // l.C15382, l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ C15382 mo10271(String str) {
        m27681(str);
        return this;
    }

    public C10907(C6129 c6129) {
        super(c6129);
        this.f34536 = 1;
        Map map = Collections.EMPTY_MAP;
        this.f34538 = map;
        this.f34535 = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27681(String str) {
        int i;
        String str2 = this.f50164;
        if (!str.contains(str2)) {
            this.f50160.append(str);
            return;
        }
        StringBuilder sb = this.f50160;
        StringBuilder sbM27333 = C10732.m27333(str2);
        sbM27333.append(this.f50161);
        sb.append(str.replace(str2, sbM27333.toString()));
        int i2 = this.f34536;
        int i3 = C12326.f39603;
        if (!str.isEmpty() && str2 != null && !str2.isEmpty()) {
            int length = str2.length();
            int i4 = 0;
            i = 0;
            while (true) {
                int iIndexOf = str.indexOf(str2, i4);
                if (iIndexOf == -1) {
                    break;
                }
                i++;
                i4 = iIndexOf + length;
            }
        } else {
            i = 0;
        }
        this.f34536 = i2 + i;
        this.f34537 = 0;
    }

    @Override // l.C15382, l.InterfaceC3145
    public final InterfaceC3145 add(String str) {
        this.f50160.append(str);
        this.f34537 = str.length() + this.f34537;
        return this;
    }

    @Override // l.C15382, l.InterfaceC3145
    public final C15382 add(String str) {
        this.f50160.append(str);
        this.f34537 = str.length() + this.f34537;
        return this;
    }

    @Override // l.C15382, l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3145 mo10270(char c) {
        this.f50160.append(c);
        this.f34537++;
        return this;
    }

    @Override // l.C15382, l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public final C15382 mo10270(char c) {
        this.f50160.append(c);
        this.f34537++;
        return this;
    }

    @Override // l.C15382, l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3145 mo10272(C10907 c10907) {
        this.f34536--;
        int length = this.f50160.length();
        for (Map.Entry entry : c10907.f34538.entrySet()) {
            m27679((InterfaceC11653) entry.getValue(), ((Integer) entry.getKey()).intValue() + length);
        }
        for (Map.Entry entry2 : c10907.f34535.entrySet()) {
            int iIntValue = ((Integer) entry2.getKey()).intValue() + this.f34536;
            Integer num = (Integer) entry2.getValue();
            num.intValue();
            if (this.f34535.isEmpty()) {
                this.f34535 = new TreeMap();
            }
            this.f34535.put(Integer.valueOf(iIntValue), num);
        }
        this.f34536 += c10907.f34536;
        this.f34537 = c10907.f34537;
        this.f50160.append((CharSequence) c10907.f50160);
        return this;
    }

    @Override // l.C15382
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo27682() {
        this.f50160.append(this.f50164);
        this.f34536++;
        this.f34537 = 0;
    }

    @Override // l.C15382
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo27680() {
        this.f50160.append(this.f50161);
        this.f34537 = this.f50161.length() + this.f34537;
    }

    @Override // l.C15382, l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public final void mo10275(InterfaceC16874 interfaceC16874) {
        if (interfaceC16874 == null) {
            return;
        }
        mo10274(new C16128(interfaceC16874, -1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27679(InterfaceC11653 interfaceC11653, int i) {
        if (this.f34538.isEmpty()) {
            this.f34538 = new HashMap();
        }
        this.f34538.put(Integer.valueOf(i), interfaceC11653);
    }

    @Override // l.C15382, l.InterfaceC3145
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10284(int i) {
        if (i == 0) {
            return;
        }
        int i2 = this.f34536;
        if (this.f34535.isEmpty()) {
            this.f34535 = new TreeMap();
        }
        this.f34535.put(Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC23283 m27683() {
        String string = this.f50160.toString();
        this.f50160 = null;
        return new C22096(string, this.f34535, this.f34538);
    }

    @Override // l.C15382, l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public final void mo10274(InterfaceC11653 interfaceC11653) {
        if (interfaceC11653 == null) {
            return;
        }
        m27679(interfaceC11653, this.f50160.length());
    }

    @Override // l.C15382, l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public final void mo10276(C17620 c17620) {
        m27679(c17620, this.f50160.length() - this.f34537);
    }
}
