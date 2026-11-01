package l;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.֡᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P44J */
/* JADX INFO: loaded from: classes2.dex */
public class C0617 extends AbstractC14730 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C11639 f2677;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f2678;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15436 f2679;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public WeakReference f2680;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final List f2675 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f2676 = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String f2674 = C15436.m36928("baseUri");

    public C0617(C11639 c11639, String str, C15436 c15436) {
        C5557.m15341(c11639);
        this.f2678 = AbstractC14730.f48149;
        this.f2679 = c15436;
        this.f2677 = c11639;
        if (str != null) {
            m35265(str);
        }
    }

    public C0617(String str) {
        this(C11639.m29046(str, C4582.f16235), "", null);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C4747 m2847(String str) {
        C5557.m15342(str);
        AbstractC4166 abstractC4166M36984 = C15457.m36984(str);
        C5557.m15341(abstractC4166M36984);
        return C14772.m35410(abstractC4166M36984, this);
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List mo2858() {
        if (this.f2678 == AbstractC14730.f48149) {
            this.f2678 = new C20374(this, 4);
        }
        return this.f2678;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean mo2836() {
        return this.f2679 != null;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15436 mo2839() {
        if (this.f2679 == null) {
            this.f2679 = new C15436();
        }
        return this.f2679;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String mo2853() {
        for (C0617 c0617 = this; c0617 != null; c0617 = (C0617) c0617.f48150) {
            C15436 c15436 = c0617.f2679;
            if (c15436 != null) {
                String str = f2674;
                if (c15436.m36941(str)) {
                    return c0617.f2679.get(str);
                }
            }
        }
        return "";
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo2854(String str) {
        mo2839().put(f2674, str);
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo2831() {
        return this.f2678.size();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m2835(String str) {
        if (mo2836()) {
            mo2839().m36944(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2840(int i, List list) {
        if (list == null) {
            throw new C22491("Children collection to be inserted must not be null.");
        }
        int size = this.f2678.size();
        if (i < 0) {
            i += size + 1;
        }
        if (!(i >= 0 && i <= size)) {
            throw new C22491("Insert position out of bounds.");
        }
        m35262(i, (AbstractC14730[]) new ArrayList(list).toArray(new AbstractC14730[0]));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List m2857() {
        List list;
        if (this.f2678.size() == 0) {
            return f2675;
        }
        WeakReference weakReference = this.f2680;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.f2678.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            AbstractC14730 abstractC14730 = (AbstractC14730) this.f2678.get(i);
            if (abstractC14730 instanceof C0617) {
                arrayList.add((C0617) abstractC14730);
            }
        }
        this.f2680 = new WeakReference(arrayList);
        return arrayList;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String mo2863() {
        return this.f2677.getName();
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final String m2837() {
        return this.f2677.getName();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m2871(String str) {
        if (str.length() == 0) {
            throw new C22491("The 'tagName' parameter must not be empty.");
        }
        this.f2677 = C11639.m29046(str, C2028.m6519(this).m33519());
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final String m2833() {
        return this.f2677.m29052();
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final C11639 m2860() {
        return this.f2677;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2844() {
        return this.f2677.m29053();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m2834() {
        C15436 c15436 = this.f2679;
        return c15436 != null ? c15436.m36933("id") : "";
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C0617 mo2849() {
        return (C0617) this.f48150;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۠ */
    public final AbstractC14730 mo2849() {
        return (C0617) this.f48150;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m2873() {
        C0617 c0617 = (C0617) this.f48150;
        if (c0617 == null) {
            return 0;
        }
        List listM2857 = c0617.m2857();
        int size = listM2857.size();
        for (int i = 0; i < size; i++) {
            if (listM2857.get(i) == this) {
                return i;
            }
        }
        return 0;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC14730 mo2851() {
        AbstractC14730 abstractC14730 = this;
        while (true) {
            AbstractC14730 abstractC14731 = abstractC14730.f48150;
            if (abstractC14731 == null) {
                return (C0617) abstractC14730;
            }
            abstractC14730 = abstractC14731;
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0617 m2828() {
        return (C0617) m2857().get(0);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C4747 m2846() {
        return new C4747(m2857());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m2832(AbstractC14730 abstractC14730) {
        C5557.m15341(this.f48150);
        this.f48150.m35262(this.f48151, abstractC14730);
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final void m2856() {
        this.f2680 = null;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final List m2872() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC14730 abstractC14730 : this.f2678) {
            if (abstractC14730 instanceof C13715) {
                arrayList.add((C13715) abstractC14730);
            }
        }
        return C0561.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m2855(AbstractC14730 abstractC14730) {
        AbstractC14730 abstractC14731 = abstractC14730.f48150;
        if (abstractC14731 != null) {
            abstractC14731.mo17323(abstractC14730);
        }
        abstractC14730.f48150 = this;
        mo2858();
        this.f2678.add(abstractC14730);
        abstractC14730.f48151 = this.f2678.size() - 1;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C0617 m2829(String str) {
        C0617 c0617 = new C0617(C11639.m29046(str, C2028.m6519(this).m33519()), mo2853(), null);
        m2855(c0617);
        return c0617;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC14730 mo2867() {
        this.f2678.clear();
        return this;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m2868() {
        this.f2678.clear();
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C4747 m2830() {
        AbstractC14730 abstractC14730 = this.f48150;
        if (abstractC14730 == null) {
            return new C4747(0);
        }
        List<C0617> listM2857 = ((C0617) abstractC14730).m2857();
        C4747 c4747 = new C4747(listM2857.size() - 1);
        for (C0617 c0617 : listM2857) {
            if (c0617 != this) {
                c4747.add(c0617);
            }
        }
        return c4747;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C0617 m2870() {
        AbstractC14730 abstractC14730 = this.f48150;
        if (abstractC14730 == null) {
            return null;
        }
        List listM2857 = ((C0617) abstractC14730).m2857();
        int size = listM2857.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (listM2857.get(i2) == this) {
                i = i2;
                break;
            }
        }
        if (i > 0) {
            return (C0617) listM2857.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final String m2848() {
        StringBuilder sbM11782 = C4145.m11782();
        C20149.m45564(new C16141(sbM11782), this);
        return C4145.m11780(sbM11782).trim();
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final String m2865() {
        StringBuilder sbM11782 = C4145.m11782();
        C20149.m45564(new C21079(0, sbM11782), this);
        return C4145.m11780(sbM11782);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m2827(StringBuilder sb, AbstractC14730 abstractC14730) {
        if (abstractC14730 instanceof C13715) {
            sb.append(((C13715) abstractC14730).m28139());
        } else if ((abstractC14730 instanceof C0617) && ((C0617) abstractC14730).f2677.m29052().equals("br")) {
            sb.append("\n");
        }
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final String m2866() {
        StringBuilder sbM11782 = C4145.m11782();
        int size = this.f2678.size();
        for (int i = 0; i < size; i++) {
            m2827(sbM11782, (AbstractC14730) this.f2678.get(i));
        }
        return C4145.m11780(sbM11782);
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final String m2845() {
        StringBuilder sbM11782 = C4145.m11782();
        for (int i = 0; i < this.f2678.size(); i++) {
            AbstractC14730 abstractC14730 = (AbstractC14730) this.f2678.get(i);
            if (abstractC14730 instanceof C13715) {
                C13715 c13715 = (C13715) abstractC14730;
                String strM28139 = c13715.m28139();
                if (m2826(c13715.f48150) || (c13715 instanceof C21785)) {
                    sbM11782.append(strM28139);
                } else {
                    C4145.m11784(strM28139, sbM11782, C13715.m33422(sbM11782));
                }
            } else if ((abstractC14730 instanceof C0617) && ((C0617) abstractC14730).f2677.m29052().equals("br") && !C13715.m33422(sbM11782)) {
                sbM11782.append(" ");
            }
        }
        return C4145.m11780(sbM11782).trim();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m2826(AbstractC14730 abstractC14730) {
        if (abstractC14730 instanceof C0617) {
            C0617 c0617 = (C0617) abstractC14730;
            int i = 0;
            while (!c0617.f2677.m29057()) {
                c0617 = (C0617) c0617.f48150;
                i++;
                if (i >= 6 || c0617 == null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void mo2864(String str) {
        C5557.m15341((Object) str);
        m2868();
        C10497 c10497M35269 = m35269();
        if (c10497M35269 != null && c10497M35269.m26637().m33518(this.f2677.m29052())) {
            m2855(new C18963(str));
        } else {
            m2855(new C13715(str));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m2852() {
        StringBuilder sbM11782 = C4145.m11782();
        for (AbstractC14730 abstractC14730 : this.f2678) {
            if (abstractC14730 instanceof C18963) {
                sbM11782.append(((C18963) abstractC14730).m28139());
            } else if (abstractC14730 instanceof C18257) {
                sbM11782.append(((C18257) abstractC14730).m28139());
            } else if (abstractC14730 instanceof C0617) {
                sbM11782.append(((C0617) abstractC14730).m2852());
            } else if (abstractC14730 instanceof C21785) {
                sbM11782.append(((C21785) abstractC14730).m28139());
            }
        }
        return C4145.m11780(sbM11782);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m2859(String str) {
        C15436 c15436 = this.f2679;
        if (c15436 == null) {
            return false;
        }
        String strM36933 = c15436.m36933(Name.LABEL);
        int length = strM36933.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strM36933);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(strM36933.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == length2 && strM36933.regionMatches(true, i, str, 0, length2)) {
                            return true;
                        }
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return strM36933.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m2869(String str) {
        C5557.m15341((Object) str);
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(f2676.split(mo28144(Name.LABEL).trim())));
        linkedHashSet.remove("");
        linkedHashSet.add(str);
        if (linkedHashSet.isEmpty()) {
            mo2839().remove();
        } else {
            mo2839().put(Name.LABEL, C4145.m11781(linkedHashSet, " "));
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C4541 m2862() {
        return C4541.m12677(this, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2843(C19669 c19669) {
        C0617 c0617;
        C0617 c0618;
        if (!c19669.m44800()) {
            return false;
        }
        if (!this.f2677.m29050() && ((c0618 = (C0617) this.f48150) == null || !c0618.f2677.m29050())) {
            return false;
        }
        if (this.f2677.m29056() && ((c0617 = (C0617) this.f48150) == null || c0617.f2677.m29053())) {
            AbstractC14730 abstractC14730 = this.f48150;
            AbstractC14730 abstractC14731 = null;
            if (abstractC14730 != null && this.f48151 > 0) {
                abstractC14731 = (AbstractC14730) abstractC14730.mo2858().get(this.f48151 - 1);
            }
            if (abstractC14731 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2842(Appendable appendable, int i, C19669 c19669) throws IOException {
        if (m2843(c19669) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            AbstractC14730.m35260(appendable, i, c19669);
        }
        appendable.append('<').append(this.f2677.getName());
        C15436 c15436 = this.f2679;
        if (c15436 != null) {
            c15436.m36934(appendable, c19669);
        }
        if (this.f2678.isEmpty() && this.f2677.m29049()) {
            if (c19669.m44793() == EnumC8380.html && this.f2677.m29048()) {
                appendable.append('>');
                return;
            } else {
                appendable.append(" />");
                return;
            }
        }
        appendable.append('>');
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo2861(Appendable appendable, int i, C19669 c19669) throws IOException {
        if (this.f2678.isEmpty() && this.f2677.m29049()) {
            return;
        }
        if (c19669.m44800() && !this.f2678.isEmpty() && this.f2677.m29050()) {
            AbstractC14730.m35260(appendable, i, c19669);
        }
        appendable.append("</").append(this.f2677.getName()).append('>');
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m2850() {
        StringBuilder sbM11782 = C4145.m11782();
        m2841(sbM11782);
        String strM11780 = C4145.m11780(sbM11782);
        C10497 c10497M35269 = m35269();
        if (c10497M35269 == null) {
            c10497M35269 = new C10497("");
        }
        return c10497M35269.m26641().m44800() ? strM11780.trim() : strM11780;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2841(Appendable appendable) {
        int size = this.f2678.size();
        for (int i = 0; i < size; i++) {
            AbstractC14730 abstractC14730 = (AbstractC14730) this.f2678.get(i);
            C10497 c10497M35269 = abstractC14730.m35269();
            if (c10497M35269 == null) {
                c10497M35269 = new C10497("");
            }
            C20149.m45564(new C23902(appendable, c10497M35269.m26641()), abstractC14730);
        }
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C0617 mo2874clone() {
        return (C0617) super.mo2874clone();
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14730 mo2838(AbstractC14730 abstractC14730) {
        C0617 c0617 = (C0617) super.mo2838(abstractC14730);
        C15436 c15436 = this.f2679;
        c0617.f2679 = c15436 != null ? c15436.clone() : null;
        C20374 c20374 = new C20374(c0617, this.f2678.size());
        c0617.f2678 = c20374;
        c20374.addAll(this.f2678);
        return c0617;
    }
}
