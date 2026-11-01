package l;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes4.dex */
public final class C19975 implements TextWatcher {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f63948;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f63949;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3040 f63950;

    public C19975(C3040 c3040, boolean z) {
        this.f63950 = c3040;
        this.f63948 = z;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        List list = this.f63950.f11378;
        if (list == null || list.isEmpty() || i2 == 0) {
            return;
        }
        C3329 c3329Mo2399 = ((InterfaceC0507) charSequence).mo2399();
        if (i2 == 1) {
            int i4 = i + 1;
            try {
                if (i4 < c3329Mo2399.length() && c3329Mo2399.charAt(i) == '\n' && c3329Mo2399.charAt(i4) == '\n') {
                    i = i4;
                }
            } catch (Throwable th) {
                try {
                    c3329Mo2399.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        m45268(i, i2, list);
        int iM9893 = c3329Mo2399.m9893(i);
        this.f63949 = iM9893;
        int iM9894 = c3329Mo2399.m9893(i + i2) - iM9893;
        boolean z = this.f63948;
        if (iM9894 > 0) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                InterfaceC19759 interfaceC19759 = (InterfaceC19759) list.get(i5);
                int iMo23603 = interfaceC19759.mo23603(z);
                if (iMo23603 > iM9893) {
                    interfaceC19759.mo23599(Math.max(iM9893, iMo23603 - iM9894), z);
                }
                int iMo23592 = interfaceC19759.mo23592(z);
                if (iMo23592 > iM9893) {
                    interfaceC19759.mo23596(Math.max(iM9893, iMo23592 - iM9894), z);
                }
            }
        }
        C8125.m21390(z, list, new C3745(c3329Mo2399, i, i2));
        c3329Mo2399.close();
        C23520.m51799(list, new C15742());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45268(int i, int i2, List list) {
        int i3 = i + i2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19759 interfaceC19759 = (InterfaceC19759) it.next();
            boolean z = this.f63948;
            int iMo22127 = interfaceC19759.mo22127(z);
            int iMo22131 = interfaceC19759.mo22131(z);
            List listMo23604 = interfaceC19759.mo23604();
            if (i <= iMo22127 && i3 >= iMo22131) {
                it.remove();
            } else if (i3 <= iMo22127) {
                interfaceC19759.mo22134(iMo22127 - i2, z);
                interfaceC19759.mo22125(iMo22131 - i2, z);
            } else if (i < iMo22131) {
                if (i > iMo22127 && i3 < iMo22131) {
                    interfaceC19759.mo22125(iMo22131 - i2, z);
                    if (listMo23604 != null) {
                        m45269(i - iMo22127, i2, listMo23604);
                    }
                } else if (i <= iMo22127) {
                    interfaceC19759.mo22134(i, z);
                    interfaceC19759.mo22125(iMo22131 - i2, z);
                    if (listMo23604 != null) {
                        m45269(0, i2 - (iMo22127 - i), listMo23604);
                    }
                } else {
                    interfaceC19759.mo22125(i, z);
                    if (listMo23604 != null) {
                        m45269(i - iMo22127, iMo22131 - i, listMo23604);
                    }
                }
            }
            if (listMo23604 != null && listMo23604.isEmpty()) {
                interfaceC19759.mo23597((List) null);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m45269(int i, int i2, List list) {
        int i3 = i + i2;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            InterfaceC19053 interfaceC19053 = (InterfaceC19053) list.get(size);
            boolean z = this.f63948;
            int iMo22127 = interfaceC19053.mo22127(z);
            int iMo22131 = interfaceC19053.mo22131(z);
            if (iMo22127 >= 0 && iMo22131 >= 0) {
                if (i3 <= iMo22127) {
                    interfaceC19053.mo22134(iMo22127 - i2, z);
                    interfaceC19053.mo22125(iMo22131 - i2, z);
                } else if (i < iMo22131) {
                    if (i <= iMo22127 && i3 >= iMo22131) {
                        boolean z2 = !z;
                        if (interfaceC19053.mo22127(z2) == -1 && interfaceC19053.mo22131(z2) == -1) {
                            list.remove(size);
                        } else {
                            interfaceC19053.mo22134(-1, z);
                            interfaceC19053.mo22125(-1, z);
                        }
                    } else if (i > iMo22127 && i3 < iMo22131) {
                        interfaceC19053.mo22125(iMo22131 - i2, z);
                    } else if (i <= iMo22127) {
                        interfaceC19053.mo22134(i, z);
                        interfaceC19053.mo22125(iMo22131 - i2, z);
                    } else {
                        interfaceC19053.mo22125(i, z);
                    }
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        int i5;
        int iMax;
        List list = this.f63950.f11378;
        if (list == null) {
            return;
        }
        if (i3 > 0 && !list.isEmpty()) {
            C3329 c3329Mo2399 = ((InterfaceC0507) charSequence).mo2399();
            try {
                m45270(i, i3, list);
                int iM9893 = i2 > 0 ? this.f63949 : c3329Mo2399.m9893(i);
                int iM9894 = c3329Mo2399.m9893(i + i3) - c3329Mo2399.m9893(i);
                if (iM9894 > 0) {
                    int size = list.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        InterfaceC19759 interfaceC19759 = (InterfaceC19759) list.get(i6);
                        int iMo23603 = interfaceC19759.mo23603(this.f63948);
                        if (iMo23603 > iM9893) {
                            interfaceC19759.mo23599(iMo23603 + iM9894, this.f63948);
                        }
                        int iMo23592 = interfaceC19759.mo23592(this.f63948);
                        if (iMo23592 > iM9893) {
                            interfaceC19759.mo23596(iMo23592 + iM9894, this.f63948);
                        }
                    }
                }
                C8125.m21390(this.f63948, list, c3329Mo2399);
                c3329Mo2399.close();
            } catch (Throwable th) {
                try {
                    c3329Mo2399.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C23503 c23503 = this.f63950.f11370;
        boolean z = this.f63948;
        synchronized (c23503) {
            try {
                if (z) {
                    i4 = c23503.f76087;
                    i5 = c23503.f76085;
                } else {
                    i4 = c23503.f76084;
                    i5 = c23503.f76086;
                }
                if (i4 == -1 && i5 == -1) {
                    iMax = i3 + i;
                } else {
                    if (i < i4) {
                        i4 = i;
                    }
                    if (i2 > 0 && i < i5 && (i5 = i5 - i2) < i) {
                        i5 = i;
                    }
                    if (i3 > 0) {
                        iMax = i3 + Math.max(i, i5);
                        i = i4;
                    } else {
                        i = i4;
                        iMax = i5;
                    }
                }
                if (z) {
                    c23503.f76087 = i;
                    c23503.f76085 = iMax;
                } else {
                    c23503.f76084 = i;
                    c23503.f76086 = iMax;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (this.f63950.f11373 == 0) {
            this.f63950.m9119(true);
        } else {
            C4716.m13050(this.f63950.f11370, this.f63950.f11373, new RunnableC21198(1, this));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m45270(int i, int i2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19759 interfaceC19759 = (InterfaceC19759) it.next();
            boolean z = this.f63948;
            int iMo22127 = interfaceC19759.mo22127(z);
            int iMo22131 = interfaceC19759.mo22131(z);
            if (i <= iMo22127) {
                interfaceC19759.mo22134(iMo22127 + i2, z);
                interfaceC19759.mo22125(iMo22131 + i2, z);
            } else if (i < iMo22131) {
                interfaceC19759.mo22125(iMo22131 + i2, z);
                List<InterfaceC19053> listMo23604 = interfaceC19759.mo23604();
                if (listMo23604 != null) {
                    int i3 = i - iMo22127;
                    for (InterfaceC19053 interfaceC19053 : listMo23604) {
                        int iMo22128 = interfaceC19053.mo22127(z);
                        int iMo22132 = interfaceC19053.mo22131(z);
                        if (iMo22128 >= 0 && iMo22132 >= 0) {
                            if (i3 <= iMo22128) {
                                interfaceC19053.mo22134(iMo22128 + i2, z);
                                interfaceC19053.mo22125(iMo22132 + i2, z);
                            } else if (i3 < iMo22132) {
                                interfaceC19053.mo22125(iMo22132 + i2, z);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f63950.invalidate();
    }
}
