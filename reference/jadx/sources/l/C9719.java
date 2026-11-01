package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۢܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9719 extends C9595 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6771 f32718;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9719(C6771 c6771, C11992 c11992, InterfaceC7945 interfaceC7945) {
        super(c11992, interfaceC7945);
        this.f32718 = c6771;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:94:0x015a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ۘ */
    public final Iterable mo11508() {
        String strMo9700;
        int iMo3087;
        String strM18365;
        List listAsList = Arrays.asList((InterfaceC1594[]) C22808.m50470(this.f32333.mo11508(), InterfaceC1594.class));
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            int size = listAsList.size();
            byte b = 1;
            C6771 c6771 = this.f32718;
            if (i >= size) {
                for (Map.Entry entry : map.entrySet()) {
                    listAsList.set(((Integer) entry.getKey()).intValue(), (InterfaceC1594) entry.getValue());
                }
                for (int i2 = 0; i2 < listAsList.size(); i2++) {
                    InterfaceC1594 interfaceC1594 = (InterfaceC1594) listAsList.get(i2);
                    String strM18370 = C6771.m18370(interfaceC1594);
                    if (strM18370 != null && !strM18370.isEmpty()) {
                        String strM18366 = C6771.m18366(strM18370);
                        if (C3184.m9601(1, strM18366) == ';') {
                            String strM18367 = C6771.m18367(c6771, strM18366);
                            if (!strM18366.equals(strM18367)) {
                                listAsList.set(i2, new C13973(((InterfaceC4685) interfaceC1594).mo1140(), C6771.m18351(strM18367)));
                            }
                        }
                    }
                }
                return C15604.m37268(listAsList, this.f32334.m29864());
            }
            InterfaceC1594 interfaceC1595 = (InterfaceC1594) listAsList.get(i);
            if (interfaceC1595.mo5435() == EnumC10297.f35162) {
                InterfaceC13797 interfaceC13797 = (InterfaceC13797) interfaceC1595;
                if (C6771.m18373((InterfaceC8858) interfaceC13797.getReference())) {
                    C6771.m18361(c6771, listAsList, map, C6771.m18350(i, interfaceC13797.mo3085(), listAsList), interfaceC13797.mo3085());
                }
            } else if (interfaceC1595.mo5435() == EnumC10297.f35236) {
                InterfaceC13797 interfaceC13798 = (InterfaceC13797) interfaceC1595;
                InterfaceC8858 interfaceC8858 = (InterfaceC8858) interfaceC13798.getReference();
                String strMo9701 = interfaceC8858.mo9700();
                String name = interfaceC8858.getName();
                String strMo9698 = interfaceC8858.mo9698();
                strMo9701.getClass();
                switch (strMo9701.hashCode()) {
                    case -1945282323:
                        if (strMo9701.equals("Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1253042716:
                        if (!strMo9701.equals("Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;")) {
                            b = -1;
                        }
                        break;
                    case 652536721:
                        if (strMo9701.equals("Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1518216451:
                        if (strMo9701.equals("Ljava/lang/Class;")) {
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
                        if (name.equals("newUpdater") && strMo9698.equals(strMo9701)) {
                            int iMo3085 = interfaceC13798.mo3085();
                            if (interfaceC8858.mo9700().equals("Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;")) {
                                iMo3087 = interfaceC13798.mo3089();
                            } else {
                                iMo3087 = interfaceC13798.mo3087();
                            }
                            int i3 = iMo3087;
                            strM18365 = C6771.m18365(i, iMo3085, listAsList);
                            if (strM18365 == null && c6771.f22863.m42052(strM18365)) {
                                C6771.m18362(c6771, listAsList, map, c6771.f22863.m42054(strM18365), i, i3);
                            }
                        } else {
                            strMo9700 = interfaceC8858.mo9700();
                            String name2 = interfaceC8858.getName();
                            String strMo9699 = interfaceC8858.mo9698();
                            if (!strMo9700.equals("Ljava/lang/Class;") && ((name2.equals("getMethod") || name2.equals("getDeclaredMethod")) && strMo9699.equals("Ljava/lang/reflect/Method;"))) {
                                int iMo3086 = interfaceC13798.mo3085();
                                int iMo3088 = interfaceC13798.mo3087();
                                int iMo3089 = interfaceC13798.mo3089();
                                String strM18368 = C6771.m18365(i, iMo3086, listAsList);
                                if (strM18368 != null && c6771.f22863.m42052(strM18368)) {
                                    C6771.m18363(c6771, listAsList, map, c6771.f22863.m42054(strM18368), i, iMo3088, iMo3089);
                                }
                            }
                        }
                        break;
                    case 3:
                        if (strMo9698.equals("Ljava/lang/reflect/Field;") && (name.equals("getField") || name.equals("getDeclaredField"))) {
                            int iMo30810 = interfaceC13798.mo3085();
                            if (interfaceC8858.mo9700().equals("Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;")) {
                                iMo3087 = interfaceC13798.mo3089();
                            } else {
                                iMo3087 = interfaceC13798.mo3087();
                            }
                            int i4 = iMo3087;
                            strM18365 = C6771.m18365(i, iMo30810, listAsList);
                            if (strM18365 == null) {
                            }
                        } else {
                            strMo9700 = interfaceC8858.mo9700();
                            String name3 = interfaceC8858.getName();
                            String strMo96910 = interfaceC8858.mo9698();
                            if (!strMo9700.equals("Ljava/lang/Class;")) {
                            }
                        }
                        break;
                    default:
                        strMo9700 = interfaceC8858.mo9700();
                        String name4 = interfaceC8858.getName();
                        String strMo96911 = interfaceC8858.mo9698();
                        if (!strMo9700.equals("Ljava/lang/Class;")) {
                        }
                        break;
                }
            }
            i++;
        }
    }
}
