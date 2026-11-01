package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9990 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC22685 f34122 = new C21278();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6975 f34123;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6975 f34124;

    /* JADX INFO: renamed from: ۖ */
    public abstract long mo3898(Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract long mo3899(Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3900(long j, Object obj);

    /* JADX INFO: renamed from: ۨ */
    public abstract long mo3901(Object obj);

    /* JADX INFO: renamed from: ۨ */
    public abstract Object mo3902(String str);

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo3903(long j, Object obj);

    /* JADX INFO: renamed from: ܰ */
    public abstract String mo3904(Object obj);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo3905(long j, Object obj);

    public AbstractC9990(Collection collection) {
        boolean z;
        long jMo20772;
        boolean z2;
        C19162 c19162;
        AbstractC9990 abstractC9990 = this;
        abstractC9990.f34123 = new C6975(f34122);
        abstractC9990.f34124 = new C6975(f34122);
        C16277 c16277 = C16277.f52439;
        C19162 c19163 = new C19162(c16277, c16277);
        Iterator it = collection.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C16277 c16277M38433 = C16277.m38433(abstractC9990.mo3904(next));
            if (!c16277M38433.isEmpty()) {
                int iIndexOf = c16277M38433.indexOf(0);
                int i = 0;
                C19162 c19164 = c19163;
                while (iIndexOf != -1) {
                    int i2 = iIndexOf + 1;
                    C16277 c16277M38435 = c16277M38433.m38435(i, i2);
                    C19162 c19165 = (C19162) c19164.f61891.get(c16277M38435);
                    if (c19165 == null) {
                        C19162 c19166 = new C19162(c16277M38433.m38435(0, i2), c16277M38435);
                        c19164.f61891.put(c16277M38435, c19166);
                        if (c19164.f61891.size() == 20) {
                            c19164.f61891 = new HashMap(c19164.f61891);
                        }
                        c19165 = c19166;
                    }
                    if (iIndexOf == c16277M38433.length() - 1) {
                        c19165.f61894 = new C7873(abstractC9990, next);
                        c19165.f61890 = abstractC9990.mo3898(next);
                        break;
                    } else {
                        iIndexOf = c16277M38433.indexOf(i2);
                        i = i2;
                        c19164 = c19165;
                    }
                }
                if (iIndexOf == -1) {
                    C16277 c16277M38436 = c16277M38433.m38436(i);
                    C19162 c19167 = new C19162(c16277M38433, c16277M38436);
                    c19167.f61894 = new C7873(abstractC9990, next);
                    c19167.f61890 = abstractC9990.mo3898(next);
                    c19164.m43970(c16277M38436, c19167);
                }
            }
        }
        C8387 c8387 = new C8387();
        for (C19162 c19168 : c19163.f61891.values()) {
            if (c19168.m43971()) {
                c8387.add(new C18456(c19168));
            }
        }
        while (!c8387.isEmpty()) {
            C18456 c18456 = (C18456) c8387.get(c8387.size() - 1);
            C19162 c19169 = c18456.f58814;
            if (c18456.f58815) {
                c8387.pop();
                AbstractC17750 c8579 = c19169.f61894;
                long j = 0;
                if (c8579 == null) {
                    C16277 c16278 = c19169.f61893;
                    c8579 = new C8579(abstractC9990, c16278);
                    abstractC9990.f34124.put(c16278, c8579);
                    c19169.f61894 = c8579;
                    z2 = true;
                    jMo20772 = 0;
                } else {
                    jMo20772 = c8579.mo20772();
                    z2 = false;
                }
                long j2 = jMo20772;
                long j3 = 0;
                for (C19162 c191610 : c19169.f61891.values()) {
                    AbstractC17750 abstractC17750 = c191610.f61894;
                    C19162 c191611 = c19163;
                    long j4 = c191610.f61890;
                    long jMo20775 = abstractC17750.mo20775();
                    j = jMo20775 != -1 ? j + jMo20775 : j;
                    long jMo20773 = abstractC17750.mo20773();
                    j3 = jMo20773 != -1 ? j3 + jMo20773 : j3;
                    if (j4 > j2) {
                        j2 = j4;
                    }
                    c19163 = c191611;
                }
                c19162 = c19163;
                c8579.mo20778(j);
                c8579.mo20774(j3);
                if (z2) {
                    c8579.mo20776(j2);
                }
                c19169.f61890 = j2;
            } else {
                c18456.f58815 = z;
                for (C19162 c191612 : c19169.f61891.values()) {
                    if (c191612.m43971()) {
                        c8387.add(new C18456(c191612));
                    }
                }
                c19162 = c19163;
            }
            z = true;
            abstractC9990 = this;
            c19163 = c19162;
        }
        C8387 c8388 = new C8387();
        c8388.add(c19163);
        while (!c8388.isEmpty()) {
            C19162 c191613 = (C19162) c8388.pop();
            Collection<C19162> collectionValues = c191613.f61891.values();
            ArrayList arrayList = new ArrayList(collectionValues.size());
            for (C19162 c191614 : collectionValues) {
                AbstractC17750 abstractC17751 = c191614.f61894;
                C13638.requireNonNull(abstractC17751);
                arrayList.add(abstractC17751);
                if (c191614.m43971()) {
                    c8388.add(c191614);
                }
            }
            this.f34123.put(c191613.f61893, arrayList);
        }
        this.f34123.m18759();
        this.f34124.m18759();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m25250(String str) {
        AbstractC17750 abstractC17750 = (AbstractC17750) this.f34124.get(str);
        if (abstractC17750 == null) {
            return null;
        }
        return abstractC17750.mo20777();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private InterfaceC5046 m25249(String str) {
        if (str == null) {
            str = "";
        }
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        List list = (List) this.f34123.get(str);
        if (list == null) {
            return C11397.empty();
        }
        return C9030.stream(list).map(new C14929());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m25252(String str) {
        return (List) m25249(str).collect(C1890.toUnmodifiableList());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m25251(String str, Comparator comparator) {
        return (List) m25249(str).sorted(comparator).collect(C1890.toUnmodifiableList());
    }
}
