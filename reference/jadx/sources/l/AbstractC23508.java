package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩻ۛ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 3ANU */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23508 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5681 f76096 = new C5681();
    public volatile /* synthetic */ Object onCloseHandler = null;

    static {
        AtomicReferenceFieldUpdater.newUpdater(AbstractC23508.class, Object.class, "onCloseHandler");
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo5524() {
        return "";
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5681 m51760() {
        return this.f76096;
    }

    /* JADX INFO: renamed from: ۙ */
    public Object mo5523(C5331 c5331) {
        InterfaceC13069 interfaceC13069M51758;
        do {
            interfaceC13069M51758 = m51758();
            if (interfaceC13069M51758 == null) {
                return C10808.f36822;
            }
        } while (interfaceC13069M51758.mo7613(c5331) == null);
        interfaceC13069M51758.mo7612(c5331);
        return interfaceC13069M51758.mo4050();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2484 m51762() {
        C4269 c4269M12066 = this.f76096.m12066();
        C2484 c2484 = c4269M12066 instanceof C2484 ? (C2484) c4269M12066 : null;
        if (c2484 == null) {
            return null;
        }
        m51757(c2484);
        return c2484;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m51761(C5331 c5331) {
        Object objMo5523 = mo5523(c5331);
        if (objMo5523 == C10808.f36821) {
            return C7321.f24318;
        }
        if (objMo5523 == C10808.f36822) {
            C2484 c2484M51762 = m51762();
            if (c2484M51762 != null) {
                m51757(c2484M51762);
                return new C4601(new C22241("Channel was closed"));
            }
            return C11658.f39187;
        }
        if (!(objMo5523 instanceof C2484)) {
            throw new IllegalStateException(("trySend returned " + objMo5523).toString());
        }
        m51757((C2484) objMo5523);
        return new C4601(new C22241("Channel was closed"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ۘ᩻۠] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC13069 m51758() {
        ?? r1;
        C4269 c4269M12073;
        while (true) {
            C5681 c5681 = this.f76096;
            r1 = (C4269) c5681.m12065();
            if (r1 == c5681 || !(r1 instanceof InterfaceC13069)) {
                break;
            }
            if ((!(((InterfaceC13069) r1) instanceof C2484) || r1.mo12072()) && (c4269M12073 = r1.m12073()) != null) {
                c4269M12073.m12074();
            }
            return (InterfaceC13069) r1;
        }
        r1 = 0;
        return (InterfaceC13069) r1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC3895 m51759() {
        C4269 c4269;
        C4269 c4269M12073;
        while (true) {
            C5681 c5681 = this.f76096;
            c4269 = (C4269) c5681.m12065();
            if (c4269 == c5681 || !(c4269 instanceof AbstractC3895)) {
                break;
            }
            if ((!(((AbstractC3895) c4269) instanceof C2484) || c4269.mo12072()) && (c4269M12073 = c4269.m12073()) != null) {
                c4269M12073.m12074();
            }
            return (AbstractC3895) c4269;
        }
        c4269 = null;
        return (AbstractC3895) c4269;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51757(C2484 c2484) {
        Object obj = null;
        while (true) {
            C4269 c4269M12066 = c2484.m12066();
            AbstractC1073 abstractC1073 = c4269M12066 instanceof AbstractC1073 ? (AbstractC1073) c4269M12066 : null;
            if (abstractC1073 == null) {
                break;
            }
            if (abstractC1073.m12073() != null) {
                abstractC1073.m12070();
            } else if (obj == null) {
                obj = abstractC1073;
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(abstractC1073);
            } else {
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(abstractC1073);
                obj = arrayList;
            }
        }
        if (obj == null) {
            return;
        }
        if (obj instanceof ArrayList) {
            ArrayList arrayList2 = (ArrayList) obj;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    return;
                } else {
                    ((AbstractC1073) arrayList2.get(size)).mo4049(c2484);
                }
            }
        } else {
            ((AbstractC1073) obj).mo4049(c2484);
        }
    }

    public final String toString() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(C13961.m33816(this));
        sb.append('{');
        C4269 c4269 = this.f76096;
        C4269 c4269M12071 = c4269.m12071();
        if (c4269M12071 == c4269) {
            string2 = "EmptyQueue";
        } else {
            if (c4269M12071 instanceof C2484) {
                string = c4269M12071.toString();
            } else if (c4269M12071 instanceof AbstractC1073) {
                string = "ReceiveQueued";
            } else if (c4269M12071 instanceof AbstractC3895) {
                string = "SendQueued";
            } else {
                string = "UNEXPECTED:" + c4269M12071;
            }
            C4269 c4269M12066 = c4269.m12066();
            if (c4269M12066 != c4269M12071) {
                StringBuilder sbM8976 = C3012.m8976(string, ",queueSize=");
                int i = 0;
                for (C4269 c4269M12072 = (C4269) c4269.m12065(); !C13465.m32965(c4269M12072, c4269); c4269M12072 = c4269M12072.m12071()) {
                    if (c4269M12072 != null) {
                        i++;
                    }
                }
                sbM8976.append(i);
                string2 = sbM8976.toString();
                if (c4269M12066 instanceof C2484) {
                    string2 = string2 + ",closedForSend=" + c4269M12066;
                }
            } else {
                string2 = string;
            }
        }
        sb.append(string2);
        sb.append('}');
        sb.append(mo5524());
        return sb.toString();
    }
}
