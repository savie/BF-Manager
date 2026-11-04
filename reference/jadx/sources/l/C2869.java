package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2869 extends C9448 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5721 f9443;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2869(C5721 c5721, C24404 c24404, InterfaceC7140 interfaceC7140) {
        super(c24404, interfaceC7140);
        this.f9443 = c5721;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:94:0x015a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo2840() {
        String strMo6804;
        int iMo7065;
        String strM16773;
        List listAsList = Arrays.asList((InterfaceC23331[]) C16625.m39334(this.f30642.mo2840(), InterfaceC23331.class));
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            int size = listAsList.size();
            byte b = 1;
            C5721 c5721 = this.f9443;
            if (i >= size) {
                for (Map.Entry entry : map.entrySet()) {
                    listAsList.set(((Integer) entry.getKey()).intValue(), (InterfaceC23331) entry.getValue());
                }
                for (int i2 = 0; i2 < listAsList.size(); i2++) {
                    InterfaceC23331 interfaceC23331 = (InterfaceC23331) listAsList.get(i2);
                    String strM16778 = C5721.m16778(interfaceC23331);
                    if (strM16778 != null && !strM16778.isEmpty()) {
                        String strM16774 = C5721.m16774(strM16778);
                        if (C22313.m50373(1, strM16774) == ';') {
                            String strM16775 = C5721.m16775(c5721, strM16774);
                            if (!strM16774.equals(strM16775)) {
                                listAsList.set(i2, new C7212(((InterfaceC12142) interfaceC23331).mo1542(), C5721.m16783(strM16775)));
                            }
                        }
                    }
                }
                return C19906.m45834(listAsList, this.f30643.m54582());
            }
            InterfaceC23331 interfaceC23332 = (InterfaceC23331) listAsList.get(i);
            if (interfaceC23332.mo30864() == EnumC22631.f73304) {
                InterfaceC6067 interfaceC6067 = (InterfaceC6067) interfaceC23332;
                if (C5721.m16781((InterfaceC4859) interfaceC6067.getReference())) {
                    C5721.m16769(c5721, listAsList, map, C5721.m16782(i, interfaceC6067.mo7063(), listAsList), interfaceC6067.mo7063());
                }
            } else if (interfaceC23332.mo30864() == EnumC22631.f73238) {
                InterfaceC6067 interfaceC6068 = (InterfaceC6067) interfaceC23332;
                InterfaceC4859 interfaceC4859 = (InterfaceC4859) interfaceC6068.getReference();
                String strMo6805 = interfaceC4859.mo6804();
                String name = interfaceC4859.getName();
                String strMo6802 = interfaceC4859.mo6802();
                strMo6805.getClass();
                switch (strMo6805.hashCode()) {
                    case -1945282323:
                        if (strMo6805.equals("Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1253042716:
                        if (!strMo6805.equals("Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;")) {
                            b = -1;
                        }
                        break;
                    case 652536721:
                        if (strMo6805.equals("Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1518216451:
                        if (strMo6805.equals("Ljava/lang/Class;")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                        if (name.equals("newUpdater") && strMo6802.equals(strMo6805)) {
                            int iMo7063 = interfaceC6068.mo7063();
                            if (interfaceC4859.mo6804().equals("Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;")) {
                                iMo7065 = interfaceC6068.mo7061();
                            } else {
                                iMo7065 = interfaceC6068.mo7065();
                            }
                            int i3 = iMo7065;
                            strM16773 = C5721.m16773(i, iMo7063, listAsList);
                            if (strM16773 == null && c5721.f19729.m39892(strM16773)) {
                                C5721.m16770(c5721, listAsList, map, c5721.f19729.m39893(strM16773), i, i3);
                            }
                        } else {
                            strMo6804 = interfaceC4859.mo6804();
                            String name2 = interfaceC4859.getName();
                            String strMo6803 = interfaceC4859.mo6802();
                            if (!strMo6804.equals("Ljava/lang/Class;") && ((name2.equals("getMethod") || name2.equals("getDeclaredMethod")) && strMo6803.equals("Ljava/lang/reflect/Method;"))) {
                                int iMo7064 = interfaceC6068.mo7063();
                                int iMo7066 = interfaceC6068.mo7065();
                                int iMo7061 = interfaceC6068.mo7061();
                                String strM16776 = C5721.m16773(i, iMo7064, listAsList);
                                if (strM16776 != null && c5721.f19729.m39892(strM16776)) {
                                    C5721.m16771(c5721, listAsList, map, c5721.f19729.m39893(strM16776), i, iMo7066, iMo7061);
                                }
                            }
                        }
                        break;
                    case 3:
                        if (strMo6802.equals("Ljava/lang/reflect/Field;") && (name.equals("getField") || name.equals("getDeclaredField"))) {
                            int iMo7067 = interfaceC6068.mo7063();
                            if (interfaceC4859.mo6804().equals("Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;")) {
                                iMo7065 = interfaceC6068.mo7061();
                            } else {
                                iMo7065 = interfaceC6068.mo7065();
                            }
                            int i4 = iMo7065;
                            strM16773 = C5721.m16773(i, iMo7067, listAsList);
                            if (strM16773 == null) {
                            }
                        } else {
                            strMo6804 = interfaceC4859.mo6804();
                            String name3 = interfaceC4859.getName();
                            String strMo6806 = interfaceC4859.mo6802();
                            if (!strMo6804.equals("Ljava/lang/Class;")) {
                            }
                        }
                        break;
                    default:
                        strMo6804 = interfaceC4859.mo6804();
                        String name4 = interfaceC4859.getName();
                        String strMo6807 = interfaceC4859.mo6802();
                        if (!strMo6804.equals("Ljava/lang/Class;")) {
                        }
                        break;
                }
            }
            i++;
        }
    }
}
