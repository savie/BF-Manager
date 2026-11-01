package l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5608 */
/* JADX INFO: loaded from: classes3.dex */
public class C6204 extends AbstractC23700 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f21089;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Object[] f21090;

    public C6204() {
        super(4);
    }

    /* JADX INFO: renamed from: ۙ */
    public C6204 mo14320(Object... objArr) {
        if (this.f21090 != null) {
            for (Object obj : objArr) {
                mo13308(obj);
            }
            return this;
        }
        m52160(objArr.length, objArr);
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public C6204 mo14319(C6204 c6204) {
        if (this.f21090 != null) {
            for (int i = 0; i < c6204.f76682; i++) {
                Object obj = c6204.f76681[i];
                C13638.requireNonNull(obj);
                mo13308(obj);
            }
            return this;
        }
        m52160(c6204.f76682, c6204.f76681);
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC23844 mo14317() {
        AbstractC23844 abstractC23844M52572;
        int i = this.f76682;
        if (i == 0) {
            int i2 = AbstractC23844.f77093;
            return C4275.f15410;
        }
        if (i == 1) {
            Object obj = this.f76681[0];
            C13638.requireNonNull(obj);
            int i3 = AbstractC23844.f77093;
            return new C16271(obj);
        }
        if (this.f21090 == null || AbstractC23844.m52566(i) != this.f21090.length) {
            abstractC23844M52572 = AbstractC23844.m52572(this.f76682, this.f76681);
            this.f76682 = abstractC23844M52572.size();
        } else {
            int i4 = this.f76682;
            Object[] objArrCopyOf = this.f76681;
            int length = objArrCopyOf.length;
            if (i4 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            }
            int i5 = this.f21089;
            Object[] objArr = this.f21090;
            abstractC23844M52572 = new C4275(i5, objArr.length - 1, this.f76682, objArrCopyOf, objArr);
        }
        this.f76683 = true;
        this.f21090 = null;
        return abstractC23844M52572;
    }

    @Override // l.AbstractC23700
    /* JADX INFO: renamed from: ۙ */
    public C6204 mo14318(Iterable iterable) {
        iterable.getClass();
        if (this.f21090 != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                mo13308(it.next());
            }
            return this;
        }
        mo14318(iterable);
        return this;
    }

    @Override // l.AbstractC14528
    /* JADX INFO: renamed from: ۙ */
    public C6204 mo13308(Object obj) {
        obj.getClass();
        if (this.f21090 != null) {
            int iM52566 = AbstractC23844.m52566(this.f76682);
            Object[] objArr = this.f21090;
            if (iM52566 <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iM30862 = C12411.m30862(iHashCode);
                while (true) {
                    int i = iM30862 & length;
                    Object[] objArr2 = this.f21090;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f21089 += iHashCode;
                        m52161(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iM30862 = i + 1;
                }
            }
        }
        this.f21090 = null;
        m52161(obj);
        return this;
    }
}
