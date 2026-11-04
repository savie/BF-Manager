package l;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۬֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13514 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f42967;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f42968;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24943 f42969;

    public C13514(C24943 c24943, boolean z) {
        this.f42969 = c24943;
        this.f42968 = z;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        List list = this.f42969.f80732;
        if (list == null || list.isEmpty() || i2 == 0) {
            return;
        }
        C15508 c15508Mo15350 = ((InterfaceC9629) charSequence).mo15350();
        if (i2 == 1) {
            int i4 = i + 1;
            try {
                if (i4 < c15508Mo15350.length() && c15508Mo15350.charAt(i) == '\n' && c15508Mo15350.charAt(i4) == '\n') {
                    i = i4;
                }
            } catch (Throwable th) {
                try {
                    c15508Mo15350.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        m33200(i, i2, list);
        int iM37179 = c15508Mo15350.m37179(i);
        this.f42967 = iM37179;
        int iM371710 = c15508Mo15350.m37179(i + i2) - iM37179;
        boolean z = this.f42968;
        if (iM371710 > 0) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                InterfaceC8966 interfaceC8966 = (InterfaceC8966) list.get(i5);
                int iMo20529 = interfaceC8966.mo20529(z);
                if (iMo20529 > iM37179) {
                    interfaceC8966.mo20525(Math.max(iM37179, iMo20529 - iM371710), z);
                }
                int iMo20530 = interfaceC8966.mo20530(z);
                if (iMo20530 > iM37179) {
                    interfaceC8966.mo20520(Math.max(iM37179, iMo20530 - iM371710), z);
                }
            }
        }
        C21213.m48371(z, list, new C23211(c15508Mo15350, i, i2));
        c15508Mo15350.close();
        C9911.m25735(list, new C6803(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33200(int i, int i2, List list) {
        int i3 = i + i2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC8966 interfaceC8966 = (InterfaceC8966) it.next();
            boolean z = this.f42968;
            int iMo9797 = interfaceC8966.mo9797(z);
            int iMo9799 = interfaceC8966.mo9799(z);
            List listMo20527 = interfaceC8966.mo20527();
            if (i <= iMo9797 && i3 >= iMo9799) {
                it.remove();
            } else if (i3 <= iMo9797) {
                interfaceC8966.mo9806(iMo9797 - i2, z);
                interfaceC8966.mo9808(iMo9799 - i2, z);
            } else if (i < iMo9799) {
                if (i > iMo9797 && i3 < iMo9799) {
                    interfaceC8966.mo9808(iMo9799 - i2, z);
                    if (listMo20527 != null) {
                        m33201(i - iMo9797, i2, listMo20527);
                    }
                } else if (i <= iMo9797) {
                    interfaceC8966.mo9806(i, z);
                    interfaceC8966.mo9808(iMo9799 - i2, z);
                    if (listMo20527 != null) {
                        m33201(0, i2 - (iMo9797 - i), listMo20527);
                    }
                } else {
                    interfaceC8966.mo9808(i, z);
                    if (listMo20527 != null) {
                        m33201(i - iMo9797, iMo9799 - i, listMo20527);
                    }
                }
            }
            if (listMo20527 != null && listMo20527.isEmpty()) {
                interfaceC8966.mo20521((List) null);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m33201(int i, int i2, List list) {
        int i3 = i + i2;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            InterfaceC9711 interfaceC9711 = (InterfaceC9711) list.get(size);
            boolean z = this.f42968;
            int iMo9797 = interfaceC9711.mo9797(z);
            int iMo9799 = interfaceC9711.mo9799(z);
            if (iMo9797 >= 0 && iMo9799 >= 0) {
                if (i3 <= iMo9797) {
                    interfaceC9711.mo9806(iMo9797 - i2, z);
                    interfaceC9711.mo9808(iMo9799 - i2, z);
                } else if (i < iMo9799) {
                    if (i <= iMo9797 && i3 >= iMo9799) {
                        boolean z2 = !z;
                        if (interfaceC9711.mo9797(z2) == -1 && interfaceC9711.mo9799(z2) == -1) {
                            list.remove(size);
                        } else {
                            interfaceC9711.mo9806(-1, z);
                            interfaceC9711.mo9808(-1, z);
                        }
                    } else if (i > iMo9797 && i3 < iMo9799) {
                        interfaceC9711.mo9808(iMo9799 - i2, z);
                    } else if (i <= iMo9797) {
                        interfaceC9711.mo9806(i, z);
                        interfaceC9711.mo9808(iMo9799 - i2, z);
                    } else {
                        interfaceC9711.mo9808(i, z);
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
        List list = this.f42969.f80732;
        if (list == null) {
            return;
        }
        if (i3 > 0 && !list.isEmpty()) {
            C15508 c15508Mo15350 = ((InterfaceC9629) charSequence).mo15350();
            try {
                m33202(i, i3, list);
                int iM37179 = i2 > 0 ? this.f42967 : c15508Mo15350.m37179(i);
                int iM371710 = c15508Mo15350.m37179(i + i3) - c15508Mo15350.m37179(i);
                if (iM371710 > 0) {
                    int size = list.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        InterfaceC8966 interfaceC8966 = (InterfaceC8966) list.get(i6);
                        int iMo20529 = interfaceC8966.mo20529(this.f42968);
                        if (iMo20529 > iM37179) {
                            interfaceC8966.mo20525(iMo20529 + iM371710, this.f42968);
                        }
                        int iMo20530 = interfaceC8966.mo20530(this.f42968);
                        if (iMo20530 > iM37179) {
                            interfaceC8966.mo20520(iMo20530 + iM371710, this.f42968);
                        }
                    }
                }
                C21213.m48371(this.f42968, list, c15508Mo15350);
                c15508Mo15350.close();
            } catch (Throwable th) {
                try {
                    c15508Mo15350.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C13008 c13008 = this.f42969.f80737;
        boolean z = this.f42968;
        synchronized (c13008) {
            try {
                if (z) {
                    i4 = c13008.f41672;
                    i5 = c13008.f41670;
                } else {
                    i4 = c13008.f41673;
                    i5 = c13008.f41671;
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
                    c13008.f41672 = i;
                    c13008.f41670 = iMax;
                } else {
                    c13008.f41673 = i;
                    c13008.f41671 = iMax;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (this.f42969.f80738 == 0) {
            this.f42969.m55697(true);
        } else {
            C5261.m15835(this.f42969.f80737, this.f42969.f80738, new RunnableC19699(1, this));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m33202(int i, int i2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC8966 interfaceC8966 = (InterfaceC8966) it.next();
            boolean z = this.f42968;
            int iMo9797 = interfaceC8966.mo9797(z);
            int iMo9799 = interfaceC8966.mo9799(z);
            if (i <= iMo9797) {
                interfaceC8966.mo9806(iMo9797 + i2, z);
                interfaceC8966.mo9808(iMo9799 + i2, z);
            } else if (i < iMo9799) {
                interfaceC8966.mo9808(iMo9799 + i2, z);
                List<InterfaceC9711> listMo20527 = interfaceC8966.mo20527();
                if (listMo20527 != null) {
                    int i3 = i - iMo9797;
                    for (InterfaceC9711 interfaceC9711 : listMo20527) {
                        int iMo9798 = interfaceC9711.mo9797(z);
                        int iMo97910 = interfaceC9711.mo9799(z);
                        if (iMo9798 >= 0 && iMo97910 >= 0) {
                            if (i3 <= iMo9798) {
                                interfaceC9711.mo9806(iMo9798 + i2, z);
                                interfaceC9711.mo9808(iMo97910 + i2, z);
                            } else if (i3 < iMo97910) {
                                interfaceC9711.mo9808(iMo97910 + i2, z);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f42969.invalidate();
    }
}
