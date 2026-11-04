package l;

import bin.mt.plus.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W261 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15152 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f49439;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C8614 f49441;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C19802 f49442;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f49444;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f49443 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f49440 = -1;

    public C15152(C8614 c8614) {
        this.f49441 = c8614;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m36475() {
        return this.f49444;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36468() {
        if (this.f49444) {
            throw new IllegalStateException("Already in selection mode");
        }
        C8614 c8614 = this.f49441;
        if (c8614.m23218()) {
            throw new IllegalStateException("In paste mode");
        }
        for (InterfaceC2386 interfaceC2386 : c8614.m23202()) {
            if (!interfaceC2386.mo8106()) {
                interfaceC2386.setChecked(false);
            }
        }
        this.f49443 = 0;
        this.f49444 = true;
        this.f49440 = -1;
        m36455();
        c8614.m23234();
        this.f49439 = null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m36467(int i) {
        if (this.f49444) {
            throw new IllegalStateException("Already in selection mode");
        }
        C8614 c8614 = this.f49441;
        if (c8614.m23218()) {
            throw new IllegalStateException("In paste mode");
        }
        for (InterfaceC2386 interfaceC2386 : c8614.m23202()) {
            if (!interfaceC2386.mo8106()) {
                interfaceC2386.setChecked(false);
            }
        }
        List listM23215 = c8614.m23215();
        if (i >= listM23215.size()) {
            return;
        }
        ((InterfaceC2386) listM23215.get(i)).setChecked(true);
        this.f49443 = 1;
        this.f49444 = true;
        this.f49440 = i;
        m36455();
        c8614.m23234();
        this.f49439 = null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m36470() {
        return this.f49440 != -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36472() {
        this.f49440 = -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m36474(int i) {
        if (!this.f49444) {
            throw new IllegalStateException("No in selection mode");
        }
        C8614 c8614 = this.f49441;
        if (c8614.m23218()) {
            throw new IllegalStateException("In paste mode");
        }
        List listM23215 = c8614.m23215();
        int i2 = this.f49440;
        if (i2 == -1) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) listM23215.get(i);
            if (interfaceC2386.mo8106()) {
                return false;
            }
            if (!interfaceC2386.isChecked()) {
                interfaceC2386.setChecked(true);
                this.f49443++;
            }
            this.f49440 = i;
            c8614.m23234();
            this.f49439 = null;
            return false;
        }
        int iMax = Math.max(i, this.f49440);
        for (int iMin = Math.min(i, i2); iMin <= iMax; iMin++) {
            InterfaceC2386 interfaceC2387 = (InterfaceC2386) listM23215.get(iMin);
            if (!interfaceC2387.mo8106() && !interfaceC2387.isChecked()) {
                interfaceC2387.setChecked(true);
                this.f49443++;
            }
        }
        this.f49440 = -1;
        c8614.m23234();
        this.f49439 = null;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36461(InterfaceC2386 interfaceC2386, boolean z) {
        if (!this.f49444) {
            throw new IllegalStateException("No in selection mode");
        }
        C8614 c8614 = this.f49441;
        if (c8614.m23218()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49440 = -1;
        if (interfaceC2386.isChecked() == z) {
            return;
        }
        interfaceC2386.setChecked(z);
        if (z) {
            this.f49443++;
        } else {
            this.f49443--;
        }
        c8614.m23234();
        this.f49439 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36464(InterfaceC2386 interfaceC2386) {
        if (!this.f49444) {
            throw new IllegalStateException("No in selection mode");
        }
        C8614 c8614 = this.f49441;
        if (c8614.m23218()) {
            throw new IllegalStateException("In paste mode");
        }
        boolean zIsChecked = interfaceC2386.isChecked();
        boolean z = !zIsChecked;
        interfaceC2386.setChecked(z);
        if (!zIsChecked) {
            this.f49443++;
        } else {
            this.f49443--;
        }
        this.f49440 = -1;
        c8614.m23234();
        this.f49439 = null;
        return z;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m36471() {
        if (this.f49444) {
            return this.f49443 > 0;
        }
        throw new IllegalStateException("No in selection mode");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m36466() {
        if (!this.f49444) {
            throw new IllegalStateException("No in selection mode");
        }
        return this.f49443;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m36476() {
        this.f49443 = 0;
        this.f49440 = -1;
        C8614 c8614 = this.f49441;
        Iterator it = c8614.m23202().iterator();
        while (it.hasNext()) {
            if (((InterfaceC2386) it.next()).isChecked()) {
                this.f49443++;
            }
        }
        if (this.f49443 == 0) {
            if (this.f49444) {
                this.f49444 = false;
                m36455();
            }
        } else if (!this.f49444) {
            this.f49444 = true;
            m36455();
        }
        c8614.m23234();
        this.f49439 = null;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m36469() {
        C8614 c8614 = this.f49441;
        if (c8614.m23218()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49440 = -1;
        if (!this.f49444) {
            for (InterfaceC2386 interfaceC2386 : c8614.m23202()) {
                if (!interfaceC2386.mo8106()) {
                    interfaceC2386.setChecked(false);
                }
            }
            this.f49443 = 0;
        } else {
            HashSet hashSet = this.f49439;
            if (hashSet != null) {
                this.f49443 = 0;
                for (InterfaceC2386 interfaceC2387 : c8614.m23215()) {
                    if (!interfaceC2387.mo8106()) {
                        interfaceC2387.setChecked(hashSet.contains(interfaceC2387.getPath()));
                        if (interfaceC2387.isChecked()) {
                            this.f49443++;
                        }
                    }
                }
                if (this.f49443 == 0 && this.f49444) {
                    this.f49444 = false;
                    m36455();
                }
                this.f49439 = null;
                c8614.m23234();
                return;
            }
        }
        HashSet hashSet2 = this.f49443 > 0 ? new HashSet() : null;
        for (InterfaceC2386 interfaceC2388 : c8614.m23215()) {
            if (!interfaceC2388.mo8106()) {
                if (!interfaceC2388.isChecked()) {
                    interfaceC2388.setChecked(true);
                    this.f49443++;
                } else if (hashSet2 != null) {
                    hashSet2.add(interfaceC2388.getPath());
                }
            }
        }
        if (this.f49443 == 0) {
            if (this.f49444) {
                this.f49444 = false;
                m36455();
            }
        } else if (!this.f49444) {
            this.f49444 = true;
            m36455();
        }
        c8614.m23234();
        this.f49439 = hashSet2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m36465() {
        if (!this.f49444) {
            throw new IllegalStateException("No in selection mode");
        }
        C8614 c8614 = this.f49441;
        if (c8614.m23218()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49440 = -1;
        for (InterfaceC2386 interfaceC2386 : c8614.m23215()) {
            if (!interfaceC2386.mo8106()) {
                if (interfaceC2386.isChecked()) {
                    interfaceC2386.setChecked(false);
                    this.f49443--;
                } else {
                    interfaceC2386.setChecked(true);
                    this.f49443++;
                }
            }
        }
        if (this.f49443 == 0) {
            this.f49444 = false;
            m36455();
        }
        c8614.m23234();
        this.f49439 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36457() {
        if (!this.f49444) {
            throw new IllegalStateException("No in selection mode");
        }
        C8614 c8614 = this.f49441;
        if (c8614.m23218()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49440 = -1;
        if (this.f49443 == 0) {
            return;
        }
        C18037 c18037 = new C18037(0);
        List<InterfaceC2386> listM23215 = c8614.m23215();
        for (InterfaceC2386 interfaceC2386 : listM23215) {
            if (interfaceC2386.isChecked()) {
                c18037.add(m36456(interfaceC2386));
            }
        }
        for (InterfaceC2386 interfaceC2387 : listM23215) {
            if (!interfaceC2387.mo8106() && !interfaceC2387.isChecked() && c18037.contains(m36456(interfaceC2387))) {
                interfaceC2387.setChecked(true);
                this.f49443++;
            }
        }
        c8614.m23234();
        this.f49439 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36460(long j, long j2) {
        if (!this.f49444) {
            throw new IllegalStateException("No in selection mode");
        }
        C8614 c8614 = this.f49441;
        if (c8614.m23218()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49440 = -1;
        for (InterfaceC2386 interfaceC2386 : c8614.m23215()) {
            if (!interfaceC2386.mo8106()) {
                if (!interfaceC2386.mo8102()) {
                    if (interfaceC2386.isChecked()) {
                        interfaceC2386.setChecked(false);
                        this.f49443--;
                    }
                } else {
                    long size = interfaceC2386.getSize();
                    if (j <= size && size < j2) {
                        if (!interfaceC2386.isChecked()) {
                            interfaceC2386.setChecked(true);
                            this.f49443++;
                        }
                    } else if (interfaceC2386.isChecked()) {
                        interfaceC2386.setChecked(false);
                        this.f49443--;
                    }
                }
            }
        }
        if (m36471()) {
            c8614.m23234();
            this.f49439 = null;
        } else {
            m36458();
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36462(InterfaceC4787 interfaceC4787) {
        if (!this.f49444) {
            throw new IllegalStateException("No in selection mode");
        }
        C8614 c8614 = this.f49441;
        if (c8614.m23218()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49440 = -1;
        for (InterfaceC2386 interfaceC2386 : c8614.m23215()) {
            if (!interfaceC2386.mo8106()) {
                if (interfaceC4787.test(interfaceC2386.getName())) {
                    if (!interfaceC2386.isChecked()) {
                        interfaceC2386.setChecked(true);
                        this.f49443++;
                    }
                } else if (interfaceC2386.isChecked()) {
                    interfaceC2386.setChecked(false);
                    this.f49443--;
                }
            }
        }
        if (m36471()) {
            c8614.m23234();
            this.f49439 = null;
        } else {
            m36458();
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36473(long j, long j2) {
        if (!this.f49444) {
            throw new IllegalStateException("No in selection mode");
        }
        C8614 c8614 = this.f49441;
        if (c8614.m23218()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49440 = -1;
        for (InterfaceC2386 interfaceC2386 : c8614.m23215()) {
            if (!interfaceC2386.mo8106()) {
                long time = interfaceC2386.getTime();
                if (j <= time && time < j2) {
                    if (!interfaceC2386.isChecked()) {
                        interfaceC2386.setChecked(true);
                        this.f49443++;
                    }
                } else if (interfaceC2386.isChecked()) {
                    interfaceC2386.setChecked(false);
                    this.f49443--;
                }
            }
        }
        if (m36471()) {
            c8614.m23234();
            this.f49439 = null;
        } else {
            m36458();
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36459(int i) {
        if (!this.f49444) {
            throw new IllegalStateException("No in selection mode");
        }
        C8614 c8614 = this.f49441;
        if (c8614.m23218()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f49440 = -1;
        if (this.f49443 == 0) {
            return;
        }
        C18037 c18037 = new C18037(0);
        List<InterfaceC2386> listM23215 = c8614.m23215();
        for (InterfaceC2386 interfaceC2386 : listM23215) {
            if (interfaceC2386.isChecked()) {
                long[] jArrM40193 = C17059.m40193(i, interfaceC2386.getTime());
                c18037.add(new C19628(jArrM40193[0], jArrM40193[1]));
            }
        }
        C19628[] c19628Arr = (C19628[]) c18037.toArray(new C19628[0]);
        for (InterfaceC2386 interfaceC2387 : listM23215) {
            if (!interfaceC2387.mo8106() && !interfaceC2387.isChecked()) {
                for (C19628 c19628 : c19628Arr) {
                    if (c19628.m45272(interfaceC2387.getTime())) {
                        interfaceC2387.setChecked(true);
                        this.f49443++;
                        break;
                    }
                }
            }
        }
        c8614.m23234();
        this.f49439 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36458() {
        if (!this.f49444) {
            throw new IllegalStateException("No in selection mode");
        }
        this.f49443 = 0;
        this.f49444 = false;
        this.f49440 = -1;
        m36455();
        this.f49441.m23234();
        this.f49439 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36463(C19802 c19802) {
        this.f49442 = c19802;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m36455() {
        C19802 c19802 = this.f49442;
        if (c19802 != null) {
            C8614.m23136((C8614) c19802.f63670, (C20065) c19802.f63671);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m36456(InterfaceC2386 interfaceC2386) {
        if (interfaceC2386.isDirectory()) {
            return "/";
        }
        int iLastIndexOf = interfaceC2386.getName().lastIndexOf(46);
        return iLastIndexOf == -1 ? "." : interfaceC2386.getName().substring(iLastIndexOf + 1).toLowerCase();
    }
}
