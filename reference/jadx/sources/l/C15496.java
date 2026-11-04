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

/* JADX INFO: renamed from: l.ܳܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: P44J */
/* JADX INFO: loaded from: classes5.dex */
public class C15496 extends AbstractC17734 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C10363 f50433;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public List f50434;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C6023 f50435;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public WeakReference f50436;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final List f50431 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Pattern f50432 = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final String f50430 = C10363.m26645("baseUri");

    public C15496(C6023 c6023, String str, C10363 c10363) {
        C14838.m35754(c6023);
        this.f50434 = AbstractC17734.f58266;
        this.f50433 = c10363;
        this.f50435 = c6023;
        if (str != null) {
            m41535(str);
        }
    }

    public C15496(String str) {
        this(C6023.m17487(str, C20193.f64826), "", null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20477 m37086(String str) {
        C14838.m35755(str);
        AbstractC0078 abstractC0078M3306 = C0824.m3306(str);
        C14838.m35754(abstractC0078M3306);
        return C17493.m41001(abstractC0078M3306, this);
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List mo37075() {
        if (this.f50434 == AbstractC17734.f58266) {
            this.f50434 = new C19972(this, 4);
        }
        return this.f50434;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo37065() {
        return this.f50433 != null;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10363 mo37069() {
        if (this.f50433 == null) {
            this.f50433 = new C10363();
        }
        return this.f50433;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo37098() {
        for (C15496 c15496 = this; c15496 != null; c15496 = (C15496) c15496.f58267) {
            C10363 c10363 = c15496.f50433;
            if (c10363 != null) {
                String str = f50430;
                if (c10363.m26656(str)) {
                    return c15496.f50433.get(str);
                }
            }
        }
        return "";
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo37083(String str) {
        mo37069().put(f50430, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37064(String str) {
        if (mo37065()) {
            mo37069().m26657(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37071(int i, List list) {
        if (list == null) {
            throw new C21552("Children collection to be inserted must not be null.");
        }
        int size = this.f50434.size();
        if (i < 0) {
            i += size + 1;
        }
        if (!(i >= 0 && i <= size)) {
            throw new C21552("Insert position out of bounds.");
        }
        m41529(i, (AbstractC17734[]) new ArrayList(list).toArray(new AbstractC17734[0]));
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final List m37080() {
        List list;
        if (this.f50434.size() == 0) {
            return f50431;
        }
        WeakReference weakReference = this.f50436;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.f50434.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            AbstractC17734 abstractC17734 = (AbstractC17734) this.f50434.get(i);
            if (abstractC17734 instanceof C15496) {
                arrayList.add((C15496) abstractC17734);
            }
        }
        this.f50436 = new WeakReference(arrayList);
        return arrayList;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۤ */
    public final int mo9543() {
        return this.f50434.size();
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ܺ */
    public String mo5151() {
        return this.f50435.getName();
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final String m37066() {
        return this.f50435.getName();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m37101(String str) {
        if (str.length() == 0) {
            throw new C21552("The 'tagName' parameter must not be empty.");
        }
        this.f50435 = C6023.m17487(str, C16242.m38551(this).m30123());
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final String m37100() {
        return this.f50435.m17493();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C6023 m37077() {
        return this.f50435;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37074() {
        return this.f50435.m17497();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m37090() {
        C10363 c10363 = this.f50433;
        return c10363 != null ? c10363.m26649("id") : "";
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C15496 mo37068() {
        return (C15496) this.f58267;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۗ */
    public final AbstractC17734 mo37068() {
        return (C15496) this.f58267;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m37081() {
        C15496 c15496 = (C15496) this.f58267;
        if (c15496 == null) {
            return 0;
        }
        List listM37080 = c15496.m37080();
        int size = listM37080.size();
        for (int i = 0; i < size; i++) {
            if (listM37080.get(i) == this) {
                return i;
            }
        }
        return 0;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC17734 mo37078() {
        AbstractC17734 abstractC17734 = this;
        while (true) {
            AbstractC17734 abstractC17735 = abstractC17734.f58267;
            if (abstractC17735 == null) {
                return (C15496) abstractC17734;
            }
            abstractC17734 = abstractC17735;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15496 m37096() {
        return (C15496) m37080().get(0);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C20477 m37082() {
        return new C20477(m37080());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m37099(AbstractC17734 abstractC17734) {
        C14838.m35754(this.f58267);
        this.f58267.m41529(this.f58268, abstractC17734);
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final void m37085() {
        this.f50436 = null;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final List m37102() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC17734 abstractC17734 : this.f50434) {
            if (abstractC17734 instanceof C12513) {
                arrayList.add((C12513) abstractC17734);
            }
        }
        return C4681.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m37084(AbstractC17734 abstractC17734) {
        AbstractC17734 abstractC17735 = abstractC17734.f58267;
        if (abstractC17735 != null) {
            abstractC17735.mo29543(abstractC17734);
        }
        abstractC17734.f58267 = this;
        mo37075();
        this.f50434.add(abstractC17734);
        abstractC17734.f58268 = this.f50434.size() - 1;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C15496 m37088(String str) {
        C15496 c15496 = new C15496(C6023.m17487(str, C16242.m38551(this).m30123()), mo37098(), null);
        m37084(c15496);
        return c15496;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC17734 mo9544() {
        this.f50434.clear();
        return this;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m37091() {
        this.f50434.clear();
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C20477 m37089() {
        AbstractC17734 abstractC17734 = this.f58267;
        if (abstractC17734 == null) {
            return new C20477(0);
        }
        List<C15496> listM37080 = ((C15496) abstractC17734).m37080();
        C20477 c20477 = new C20477(listM37080.size() - 1);
        for (C15496 c15496 : listM37080) {
            if (c15496 != this) {
                c20477.add(c15496);
            }
        }
        return c20477;
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C15496 m37093() {
        AbstractC17734 abstractC17734 = this.f58267;
        if (abstractC17734 == null) {
            return null;
        }
        List listM37080 = ((C15496) abstractC17734).m37080();
        int size = listM37080.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (listM37080.get(i2) == this) {
                i = i2;
                break;
            }
        }
        if (i > 0) {
            return (C15496) listM37080.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final String m37087() {
        StringBuilder sbM2898 = C0669.m2898();
        C18723.m43536(new C22956(sbM2898), this);
        return C0669.m2896(sbM2898).trim();
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final String m37094() {
        StringBuilder sbM2898 = C0669.m2898();
        C18723.m43536(new C11021(sbM2898), this);
        return C0669.m2896(sbM2898);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m37062(StringBuilder sb, AbstractC17734 abstractC17734) {
        if (abstractC17734 instanceof C12513) {
            sb.append(((C12513) abstractC17734).m56171());
        } else if ((abstractC17734 instanceof C15496) && ((C15496) abstractC17734).f50435.m17493().equals("br")) {
            sb.append("\n");
        }
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final String m37095() {
        StringBuilder sbM2898 = C0669.m2898();
        int size = this.f50434.size();
        for (int i = 0; i < size; i++) {
            m37062(sbM2898, (AbstractC17734) this.f50434.get(i));
        }
        return C0669.m2896(sbM2898);
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final String m37097() {
        StringBuilder sbM2898 = C0669.m2898();
        for (int i = 0; i < this.f50434.size(); i++) {
            AbstractC17734 abstractC17734 = (AbstractC17734) this.f50434.get(i);
            if (abstractC17734 instanceof C12513) {
                C12513 c12513 = (C12513) abstractC17734;
                String strM56171 = c12513.m56171();
                if (m37061(c12513.f58267) || (c12513 instanceof C1415)) {
                    sbM2898.append(strM56171);
                } else {
                    C0669.m2900(strM56171, sbM2898, C12513.m31068(sbM2898));
                }
            } else if ((abstractC17734 instanceof C15496) && ((C15496) abstractC17734).f50435.m17493().equals("br") && !C12513.m31068(sbM2898)) {
                sbM2898.append(" ");
            }
        }
        return C0669.m2896(sbM2898).trim();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m37061(AbstractC17734 abstractC17734) {
        if (abstractC17734 instanceof C15496) {
            C15496 c15496 = (C15496) abstractC17734;
            int i = 0;
            while (!c15496.f50435.m17498()) {
                c15496 = (C15496) c15496.f58267;
                i++;
                if (i >= 6 || c15496 == null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܺ */
    public void mo15297(String str) {
        C14838.m35754((Object) str);
        m37091();
        C5056 c5056M41533 = m41533();
        if (c5056M41533 != null && c5056M41533.m15296().m30121(this.f50435.m17493())) {
            m37084(new C2906(str));
        } else {
            m37084(new C12513(str));
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m37063() {
        StringBuilder sbM2898 = C0669.m2898();
        for (AbstractC17734 abstractC17734 : this.f50434) {
            if (abstractC17734 instanceof C2906) {
                sbM2898.append(((C2906) abstractC17734).m56171());
            } else if (abstractC17734 instanceof C9617) {
                sbM2898.append(((C9617) abstractC17734).m56171());
            } else if (abstractC17734 instanceof C15496) {
                sbM2898.append(((C15496) abstractC17734).m37063());
            } else if (abstractC17734 instanceof C1415) {
                sbM2898.append(((C1415) abstractC17734).m56171());
            }
        }
        return C0669.m2896(sbM2898);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m37076(String str) {
        C10363 c10363 = this.f50433;
        if (c10363 == null) {
            return false;
        }
        String strM26649 = c10363.m26649(Name.LABEL);
        int length = strM26649.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strM26649);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(strM26649.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == length2 && strM26649.regionMatches(true, i, str, 0, length2)) {
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
                return strM26649.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m37092(String str) {
        C14838.m35754((Object) str);
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(f50432.split(mo41538(Name.LABEL).trim())));
        linkedHashSet.remove("");
        linkedHashSet.add(str);
        if (linkedHashSet.isEmpty()) {
            mo37069().remove();
        } else {
            mo37069().put(Name.LABEL, C0669.m2897(linkedHashSet, " "));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20718 m37067() {
        return C20718.m47383(this, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37073(C7381 c7381) {
        C15496 c15496;
        C15496 c15497;
        if (!c7381.m20280()) {
            return false;
        }
        if (!this.f50435.m17490() && ((c15497 = (C15496) this.f58267) == null || !c15497.f50435.m17490())) {
            return false;
        }
        if (this.f50435.m17494() && ((c15496 = (C15496) this.f58267) == null || c15496.f50435.m17497())) {
            AbstractC17734 abstractC17734 = this.f58267;
            AbstractC17734 abstractC17735 = null;
            if (abstractC17734 != null && this.f58268 > 0) {
                abstractC17735 = (AbstractC17734) abstractC17734.mo37075().get(this.f58268 - 1);
            }
            if (abstractC17735 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۙ */
    public void mo5150(Appendable appendable, int i, C7381 c7381) throws IOException {
        if (m37073(c7381) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            AbstractC17734.m41524(appendable, i, c7381);
        }
        appendable.append('<').append(this.f50435.getName());
        C10363 c10363 = this.f50433;
        if (c10363 != null) {
            c10363.m26650(appendable, c7381);
        }
        if (this.f50434.isEmpty() && this.f50435.m17489()) {
            if (c7381.m20275() == EnumC8872.html && this.f50435.m17492()) {
                appendable.append('>');
                return;
            } else {
                appendable.append(" />");
                return;
            }
        }
        appendable.append('>');
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ᩷ */
    public void mo5152(Appendable appendable, int i, C7381 c7381) throws IOException {
        if (this.f50434.isEmpty() && this.f50435.m17489()) {
            return;
        }
        if (c7381.m20280() && !this.f50434.isEmpty() && this.f50435.m17490()) {
            AbstractC17734.m41524(appendable, i, c7381);
        }
        appendable.append("</").append(this.f50435.getName()).append('>');
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m37079() {
        StringBuilder sbM2898 = C0669.m2898();
        m37072(sbM2898);
        String strM2896 = C0669.m2896(sbM2898);
        C5056 c5056M41533 = m41533();
        if (c5056M41533 == null) {
            c5056M41533 = new C5056("");
        }
        return c5056M41533.m15300().m20280() ? strM2896.trim() : strM2896;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37072(Appendable appendable) {
        int size = this.f50434.size();
        for (int i = 0; i < size; i++) {
            AbstractC17734 abstractC17734 = (AbstractC17734) this.f50434.get(i);
            C5056 c5056M41533 = abstractC17734.m41533();
            if (c5056M41533 == null) {
                c5056M41533 = new C5056("");
            }
            C18723.m43536(new C16988(appendable, c5056M41533.m15300()), abstractC17734);
        }
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C15496 mo5153clone() {
        return (C15496) super.mo5153clone();
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17734 mo37070(AbstractC17734 abstractC17734) {
        C15496 c15496 = (C15496) super.mo37070(abstractC17734);
        C10363 c10363 = this.f50433;
        c15496.f50433 = c10363 != null ? c10363.clone() : null;
        C19972 c19972 = new C19972(c15496, this.f50434.size());
        c15496.f50434 = c19972;
        c19972.addAll(this.f50434);
        return c15496;
    }
}
