package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.۬ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14034 extends AbstractC4823 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C8069[] f44467;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C24896 f44468;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22723[] f44469;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C7323[] f44470;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C14034[] f44471;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C21494 f44472;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14034[] f44473;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C24478[] f44474;

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩸ */
    public final C14034 mo5003() {
        return this;
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21013 mo5000() {
        return this.f44468;
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ۧ */
    public final C24896 mo5000() {
        return this.f44468;
    }

    @Override // l.AbstractC4823
    public final String getName() {
        return this.f44468.getName();
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩴ */
    public final String mo5002() {
        return this.f44468.getName();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m34198() {
        return this.f44468.m55463();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final List m34192() {
        return C4681.unmodifiableList(Arrays.asList(this.f44474));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final List m34196() {
        return C4681.unmodifiableList(Arrays.asList(this.f44467));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m34193() {
        return C4681.unmodifiableList(Arrays.asList(this.f44470));
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List m34195() {
        return C4681.unmodifiableList(Arrays.asList(this.f44473));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List m34191() {
        return C4681.unmodifiableList(Arrays.asList(this.f44471));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC5810 m34197() {
        C24896 c24896 = this.f44468;
        String strM55460 = c24896.m55460();
        if (strM55460.equals("proto3")) {
            return EnumC5810.EDITION_PROTO3;
        }
        if (strM55460.equals("editions")) {
            return c24896.m55452();
        }
        return EnumC5810.EDITION_PROTO2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14034 m34187(C24896 c24896, C14034[] c14034Arr) throws C18510 {
        C14034 c14034 = new C14034(c24896, c14034Arr, new C21494(c14034Arr));
        for (C24478 c24478 : c14034.f44474) {
            c24478.m54732();
        }
        for (C22723 c22723 : c14034.f44469) {
            C22723.m51252(c22723);
        }
        for (C7323 c7323 : c14034.f44470) {
            C7323.m20082(c7323);
        }
        return c14034;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14034 m34188(String[] strArr, C14034[] c14034Arr) {
        byte[] bytes;
        if (strArr.length == 1) {
            bytes = strArr[0].getBytes(C23447.f75889);
        } else {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
            }
            bytes = sb.toString().getBytes(C23447.f75889);
        }
        try {
            C24896 from = C24896.parseFrom(bytes);
            try {
                return m34187(from, c14034Arr);
            } catch (C18510 e) {
                throw new IllegalArgumentException("Invalid embedded descriptor for \"" + from.getName() + "\".", e);
            }
        } catch (C20463 e2) {
            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e2);
        }
    }

    public C14034(C24896 c24896, C14034[] c14034Arr, C21494 c21494) throws C18510 {
        C24478[] c24478Arr;
        C8069[] c8069Arr;
        C22723[] c22723Arr;
        C7323[] c7323Arr;
        super(0);
        this.f44472 = c21494;
        this.f44468 = c24896;
        this.f44473 = (C14034[]) c14034Arr.clone();
        HashMap map = new HashMap();
        for (C14034 c14034 : c14034Arr) {
            map.put(c14034.f44468.getName(), c14034);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c24896.m55471(); i++) {
            int iM55466 = c24896.m55466(i);
            if (iM55466 < 0 || iM55466 >= c24896.m55456()) {
                throw new C18510(this, "Invalid public dependency index.");
            }
            C14034 c14035 = (C14034) map.get(c24896.m55455(iM55466));
            if (c14035 != null) {
                arrayList.add(c14035);
            }
        }
        C14034[] c14034Arr2 = new C14034[arrayList.size()];
        this.f44471 = c14034Arr2;
        arrayList.toArray(c14034Arr2);
        c21494.m48904(this, this.f44468.m55463());
        if (c24896.m55464() <= 0) {
            c24478Arr = C19739.f63537;
        } else {
            c24478Arr = new C24478[c24896.m55464()];
        }
        this.f44474 = c24478Arr;
        for (int i2 = 0; i2 < c24896.m55464(); i2++) {
            this.f44474[i2] = new C24478(c24896.m55470(i2), this);
        }
        if (c24896.m55459() <= 0) {
            c8069Arr = C19739.f63532;
        } else {
            c8069Arr = new C8069[c24896.m55459()];
        }
        this.f44467 = c8069Arr;
        for (int i3 = 0; i3 < c24896.m55459(); i3++) {
            this.f44467[i3] = new C8069(c24896.m55469(i3), this, null);
        }
        if (c24896.m55453() <= 0) {
            c22723Arr = C19739.f63534;
        } else {
            c22723Arr = new C22723[c24896.m55453()];
        }
        this.f44469 = c22723Arr;
        for (int i4 = 0; i4 < c24896.m55453(); i4++) {
            this.f44469[i4] = new C22723(c24896.m55462(i4), this);
        }
        if (c24896.m55473() <= 0) {
            c7323Arr = C19739.f63538;
        } else {
            c7323Arr = new C7323[c24896.m55473()];
        }
        this.f44470 = c7323Arr;
        for (int i5 = 0; i5 < c24896.m55473(); i5++) {
            this.f44470[i5] = new C7323(c24896.m55458(i5), this, null, i5, true);
        }
    }

    public C14034(String str, C24478 c24478) {
        super(0);
        this.f16869 = null;
        C21494 c21494 = new C21494(new C14034[0]);
        this.f44472 = c21494;
        C11469 c11469NewBuilder = C24896.newBuilder();
        c11469NewBuilder.m28834(c24478.mo5002() + ".placeholder.proto");
        c11469NewBuilder.m28838(str);
        c11469NewBuilder.m28836(c24478.mo5000());
        C24896 c24896BuildPartial = c11469NewBuilder.buildPartial();
        if (c24896BuildPartial.isInitialized()) {
            this.f44468 = c24896BuildPartial;
            this.f44473 = new C14034[0];
            this.f44471 = new C14034[0];
            this.f44474 = new C24478[]{c24478};
            this.f44467 = C19739.f63532;
            this.f44469 = C19739.f63534;
            this.f44470 = C19739.f63538;
            c21494.m48904(this, str);
            c21494.m48903(c24478);
            return;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c24896BuildPartial);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34194() {
        try {
            m34190();
        } catch (C18510 e) {
            throw new IllegalArgumentException("Invalid features for \"" + this.f44468.getName() + "\".", e);
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m34190() {
        if (this.f16868 != null) {
            return;
        }
        synchronized (this) {
            if (this.f16868 != null) {
                return;
            }
            m14855(this.f44468.m55465().m10737());
            for (C24478 c24478 : this.f44474) {
                c24478.m54731();
            }
            for (C8069 c8069 : this.f44467) {
                C8069.m21961(c8069);
            }
            for (C22723 c22723 : this.f44469) {
                C22723.m51251(c22723);
            }
            for (C7323 c7323 : this.f44470) {
                C7323.m20079(c7323);
            }
        }
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ֫ */
    public final C16471 mo14853() {
        C7301 c7301NewBuilder = C16471.newBuilder();
        if (m34197().getNumber() >= EnumC5810.EDITION_2023.getNumber()) {
            return c7301NewBuilder.build();
        }
        if (m34197() == EnumC5810.EDITION_PROTO2 && this.f44468.m55465().m10722()) {
            C9780 c9780 = C21209.f67697;
            C6293 c6293NewBuilder = C14495.newBuilder();
            c6293NewBuilder.m17980(EnumC4055.VERIFY);
            C14495 c14495BuildPartial = c6293NewBuilder.buildPartial();
            if (!c14495BuildPartial.isInitialized()) {
                throw AbstractC0479.m2311((InterfaceC21013) c14495BuildPartial);
            }
            c7301NewBuilder.m15944(c9780, c14495BuildPartial);
        }
        return c7301NewBuilder.build();
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo14856() {
        return m34197().getNumber() < EnumC5810.EDITION_2023.getNumber() && m34197() == EnumC5810.EDITION_PROTO2 && this.f44468.m55465().m10722();
    }
}
