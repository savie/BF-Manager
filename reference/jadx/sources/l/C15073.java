package l;

import bin.mt.plus.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W261 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15073 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f49137;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f49138;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C13330 f49139;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11545 f49142;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f49141 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f49140 = -1;

    public C15073(C11545 c11545) {
        this.f49142 = c11545;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m36132() {
        return this.f49137;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m36142() {
        if (this.f49137) {
            throw new IllegalStateException("Already in selection mode");
        }
        C11545 c11545 = this.f49142;
        if (c11545.m28821()) {
            throw new IllegalStateException("In paste mode");
        }
        for (InterfaceC2557 interfaceC2557 : c11545.m28795()) {
            if (!interfaceC2557.mo7980()) {
                interfaceC2557.setChecked(false);
            }
        }
        this.f49141 = 0;
        this.f49137 = true;
        this.f49140 = -1;
        m36130();
        c11545.m28825();
        this.f49138 = null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m36144(int i) {
        if (this.f49137) {
            throw new IllegalStateException("Already in selection mode");
        }
        C11545 c11545 = this.f49142;
        if (c11545.m28821()) {
            throw new IllegalStateException("In paste mode");
        }
        for (InterfaceC2557 interfaceC2557 : c11545.m28795()) {
            if (!interfaceC2557.mo7980()) {
                interfaceC2557.setChecked(false);
            }
        }
        List listM28829 = c11545.m28829();
        if (i >= listM28829.size()) {
            return;
        }
        ((InterfaceC2557) listM28829.get(i)).setChecked(true);
        this.f49141 = 1;
        this.f49137 = true;
        this.f49140 = i;
        m36130();
        c11545.m28825();
        this.f49138 = null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m36149() {
        return this.f49140 != -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36146() {
        this.f49140 = -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m36148(int i) {
        if (!this.f49137) {
            throw new IllegalStateException("No in selection mode");
        }
        C11545 c11545 = this.f49142;
        if (c11545.m28821()) {
            throw new IllegalStateException("In paste mode");
        }
        List listM28829 = c11545.m28829();
        int i2 = this.f49140;
        if (i2 == -1) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) listM28829.get(i);
            if (interfaceC2557.mo7980()) {
                return false;
            }
            if (!interfaceC2557.isChecked()) {
                interfaceC2557.setChecked(true);
                this.f49141++;
            }
            this.f49140 = i;
            c11545.m28825();
            this.f49138 = null;
            return false;
        }
        int iMax = Math.max(i, this.f49140);
        for (int iMin = Math.min(i, i2); iMin <= iMax; iMin++) {
            InterfaceC2557 interfaceC2558 = (InterfaceC2557) listM28829.get(iMin);
            if (!interfaceC2558.mo7980() && !interfaceC2558.isChecked()) {
                interfaceC2558.setChecked(true);
                this.f49141++;
            }
        }
        this.f49140 = -1;
        c11545.m28825();
        this.f49138 = null;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36137(InterfaceC2557 interfaceC2557, boolean z) {
        if (!this.f49137) {
            throw new IllegalStateException("No in selection mode");
        }
        C11545 c11545 = this.f49142;
        if (c11545.m28821()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49140 = -1;
        if (interfaceC2557.isChecked() == z) {
            return;
        }
        interfaceC2557.setChecked(z);
        if (z) {
            this.f49141++;
        } else {
            this.f49141--;
        }
        c11545.m28825();
        this.f49138 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36140(InterfaceC2557 interfaceC2557) {
        if (!this.f49137) {
            throw new IllegalStateException("No in selection mode");
        }
        C11545 c11545 = this.f49142;
        if (c11545.m28821()) {
            throw new IllegalStateException("In paste mode");
        }
        boolean zIsChecked = interfaceC2557.isChecked();
        boolean z = !zIsChecked;
        interfaceC2557.setChecked(z);
        if (!zIsChecked) {
            this.f49141++;
        } else {
            this.f49141--;
        }
        this.f49140 = -1;
        c11545.m28825();
        this.f49138 = null;
        return z;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m36141() {
        if (this.f49137) {
            return this.f49141 > 0;
        }
        throw new IllegalStateException("No in selection mode");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m36143() {
        if (!this.f49137) {
            throw new IllegalStateException("No in selection mode");
        }
        return this.f49141;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m36150() {
        this.f49141 = 0;
        this.f49140 = -1;
        C11545 c11545 = this.f49142;
        Iterator it = c11545.m28795().iterator();
        while (it.hasNext()) {
            if (((InterfaceC2557) it.next()).isChecked()) {
                this.f49141++;
            }
        }
        if (this.f49141 == 0) {
            if (this.f49137) {
                this.f49137 = false;
                m36130();
            }
        } else if (!this.f49137) {
            this.f49137 = true;
            m36130();
        }
        c11545.m28825();
        this.f49138 = null;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m36131() {
        C11545 c11545 = this.f49142;
        if (c11545.m28821()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49140 = -1;
        if (!this.f49137) {
            for (InterfaceC2557 interfaceC2557 : c11545.m28795()) {
                if (!interfaceC2557.mo7980()) {
                    interfaceC2557.setChecked(false);
                }
            }
            this.f49141 = 0;
        } else {
            HashSet hashSet = this.f49138;
            if (hashSet != null) {
                this.f49141 = 0;
                for (InterfaceC2557 interfaceC2558 : c11545.m28829()) {
                    if (!interfaceC2558.mo7980()) {
                        interfaceC2558.setChecked(hashSet.contains(interfaceC2558.getPath()));
                        if (interfaceC2558.isChecked()) {
                            this.f49141++;
                        }
                    }
                }
                if (this.f49141 == 0 && this.f49137) {
                    this.f49137 = false;
                    m36130();
                }
                this.f49138 = null;
                c11545.m28825();
                return;
            }
        }
        HashSet hashSet2 = this.f49141 > 0 ? new HashSet() : null;
        for (InterfaceC2557 interfaceC2559 : c11545.m28829()) {
            if (!interfaceC2559.mo7980()) {
                if (!interfaceC2559.isChecked()) {
                    interfaceC2559.setChecked(true);
                    this.f49141++;
                } else if (hashSet2 != null) {
                    hashSet2.add(interfaceC2559.getPath());
                }
            }
        }
        if (this.f49141 == 0) {
            if (this.f49137) {
                this.f49137 = false;
                m36130();
            }
        } else if (!this.f49137) {
            this.f49137 = true;
            m36130();
        }
        c11545.m28825();
        this.f49138 = hashSet2;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m36145() {
        if (!this.f49137) {
            throw new IllegalStateException("No in selection mode");
        }
        C11545 c11545 = this.f49142;
        if (c11545.m28821()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49140 = -1;
        for (InterfaceC2557 interfaceC2557 : c11545.m28829()) {
            if (!interfaceC2557.mo7980()) {
                if (interfaceC2557.isChecked()) {
                    interfaceC2557.setChecked(false);
                    this.f49141--;
                } else {
                    interfaceC2557.setChecked(true);
                    this.f49141++;
                }
            }
        }
        if (this.f49141 == 0) {
            this.f49137 = false;
            m36130();
        }
        c11545.m28825();
        this.f49138 = null;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m36133() {
        if (!this.f49137) {
            throw new IllegalStateException("No in selection mode");
        }
        C11545 c11545 = this.f49142;
        if (c11545.m28821()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49140 = -1;
        if (this.f49141 == 0) {
            return;
        }
        C18623 c18623 = new C18623();
        List<InterfaceC2557> listM28829 = c11545.m28829();
        for (InterfaceC2557 interfaceC2557 : listM28829) {
            if (interfaceC2557.isChecked()) {
                c18623.add(m36129(interfaceC2557));
            }
        }
        for (InterfaceC2557 interfaceC2558 : listM28829) {
            if (!interfaceC2558.mo7980() && !interfaceC2558.isChecked() && c18623.contains(m36129(interfaceC2558))) {
                interfaceC2558.setChecked(true);
                this.f49141++;
            }
        }
        c11545.m28825();
        this.f49138 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36136(long j, long j2) {
        if (!this.f49137) {
            throw new IllegalStateException("No in selection mode");
        }
        C11545 c11545 = this.f49142;
        if (c11545.m28821()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49140 = -1;
        for (InterfaceC2557 interfaceC2557 : c11545.m28829()) {
            if (!interfaceC2557.mo7980()) {
                if (!interfaceC2557.mo7982()) {
                    if (interfaceC2557.isChecked()) {
                        interfaceC2557.setChecked(false);
                        this.f49141--;
                    }
                } else {
                    long size = interfaceC2557.getSize();
                    if (j <= size && size < j2) {
                        if (!interfaceC2557.isChecked()) {
                            interfaceC2557.setChecked(true);
                            this.f49141++;
                        }
                    } else if (interfaceC2557.isChecked()) {
                        interfaceC2557.setChecked(false);
                        this.f49141--;
                    }
                }
            }
        }
        if (m36141()) {
            c11545.m28825();
            this.f49138 = null;
        } else {
            m36134();
            C15829.m37611(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36138(InterfaceC3183 interfaceC3183) {
        if (!this.f49137) {
            throw new IllegalStateException("No in selection mode");
        }
        C11545 c11545 = this.f49142;
        if (c11545.m28821()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49140 = -1;
        for (InterfaceC2557 interfaceC2557 : c11545.m28829()) {
            if (!interfaceC2557.mo7980()) {
                if (interfaceC3183.mo1619(interfaceC2557.getName())) {
                    if (!interfaceC2557.isChecked()) {
                        interfaceC2557.setChecked(true);
                        this.f49141++;
                    }
                } else if (interfaceC2557.isChecked()) {
                    interfaceC2557.setChecked(false);
                    this.f49141--;
                }
            }
        }
        if (m36141()) {
            c11545.m28825();
            this.f49138 = null;
        } else {
            m36134();
            C15829.m37611(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36147(long j, long j2) {
        if (!this.f49137) {
            throw new IllegalStateException("No in selection mode");
        }
        C11545 c11545 = this.f49142;
        if (c11545.m28821()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49140 = -1;
        for (InterfaceC2557 interfaceC2557 : c11545.m28829()) {
            if (!interfaceC2557.mo7980()) {
                long time = interfaceC2557.getTime();
                if (j <= time && time < j2) {
                    if (!interfaceC2557.isChecked()) {
                        interfaceC2557.setChecked(true);
                        this.f49141++;
                    }
                } else if (interfaceC2557.isChecked()) {
                    interfaceC2557.setChecked(false);
                    this.f49141--;
                }
            }
        }
        if (m36141()) {
            c11545.m28825();
            this.f49138 = null;
        } else {
            m36134();
            C15829.m37611(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36135(int i) {
        if (!this.f49137) {
            throw new IllegalStateException("No in selection mode");
        }
        C11545 c11545 = this.f49142;
        if (c11545.m28821()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49140 = -1;
        if (this.f49141 == 0) {
            return;
        }
        C18623 c18623 = new C18623();
        List<InterfaceC2557> listM28829 = c11545.m28829();
        for (InterfaceC2557 interfaceC2557 : listM28829) {
            if (interfaceC2557.isChecked()) {
                long[] jArrM23180 = C8909.m23180(i, interfaceC2557.getTime());
                c18623.add(new C22834(jArrM23180[0], jArrM23180[1]));
            }
        }
        C22834[] c22834Arr = (C22834[]) c18623.toArray(new C22834[0]);
        for (InterfaceC2557 interfaceC2558 : listM28829) {
            if (!interfaceC2558.mo7980() && !interfaceC2558.isChecked()) {
                for (C22834 c22834 : c22834Arr) {
                    if (c22834.m50575(interfaceC2558.getTime())) {
                        interfaceC2558.setChecked(true);
                        this.f49141++;
                        break;
                    }
                }
            }
        }
        c11545.m28825();
        this.f49138 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36134() {
        if (!this.f49137) {
            throw new IllegalStateException("No in selection mode");
        }
        this.f49141 = 0;
        this.f49137 = false;
        this.f49140 = -1;
        m36130();
        this.f49142.m28825();
        this.f49138 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36139(C13330 c13330) {
        this.f49139 = c13330;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m36130() {
        C13330 c13330 = this.f49139;
        if (c13330 != null) {
            C11545.m28739((C11545) c13330.f44238, (C6936) c13330.f44239);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m36129(InterfaceC2557 interfaceC2557) {
        if (interfaceC2557.isDirectory()) {
            return "/";
        }
        int iLastIndexOf = interfaceC2557.getName().lastIndexOf(46);
        return iLastIndexOf == -1 ? "." : interfaceC2557.getName().substring(iLastIndexOf + 1).toLowerCase();
    }
}
