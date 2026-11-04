package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ܽܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1HX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17734 implements Cloneable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final List f58266 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC17734 f58267;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f58268;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo37065();

    /* JADX INFO: renamed from: ۙ */
    public abstract C10363 mo37069();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo5150(Appendable appendable, int i, C7381 c7381);

    /* JADX INFO: renamed from: ۚ */
    public abstract List mo37075();

    /* JADX INFO: renamed from: ۤ */
    public abstract int mo9543();

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo37083(String str);

    /* JADX INFO: renamed from: ܳ */
    public abstract AbstractC17734 mo9544();

    /* JADX INFO: renamed from: ܺ */
    public abstract String mo5151();

    /* JADX INFO: renamed from: ᩷ */
    public abstract String mo37098();

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo5152(Appendable appendable, int i, C7381 c7381);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41531() {
        return this.f58267 != null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String mo41538(String str) {
        C14838.m35754((Object) str);
        if (!mo37065()) {
            return "";
        }
        String strM26649 = mo37069().m26649(str);
        if (strM26649.length() > 0) {
            return strM26649;
        }
        return str.startsWith("abs:") ? mo41526(str.substring(4)) : "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC17734 mo41528(String str, String str2) {
        mo37069().m26661(C16242.m38551(this).m30123().m46439(str), str2);
        return this;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean mo41539(String str) {
        C14838.m35754((Object) str);
        if (!mo37065()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (mo37069().m26662(strSubstring) && !mo41526(strSubstring).isEmpty()) {
                return true;
            }
        }
        return mo37069().m26662(str);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m41535(String str) {
        C14838.m35754((Object) str);
        mo37083(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo41526(String str) {
        C14838.m35755(str);
        return (mo37065() && mo37069().m26662(str)) ? C0669.m2895(mo37098(), mo37069().m26649(str)) : "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17734 m41527(int i) {
        return (AbstractC17734) mo37075().get(i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m41534() {
        if (mo9543() == 0) {
            return f58266;
        }
        List listMo37075 = mo37075();
        ArrayList arrayList = new ArrayList(listMo37075.size());
        arrayList.addAll(listMo37075);
        return C4681.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۗ */
    public AbstractC17734 mo37068() {
        return this.f58267;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC17734 m41536() {
        return this.f58267;
    }

    /* JADX INFO: renamed from: ۛ */
    public AbstractC17734 mo37078() {
        AbstractC17734 abstractC17734 = this;
        while (true) {
            AbstractC17734 abstractC17735 = abstractC17734.f58267;
            if (abstractC17735 == null) {
                return abstractC17734;
            }
            abstractC17734 = abstractC17735;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C5056 m41533() {
        AbstractC17734 abstractC17734Mo37078 = mo37078();
        if (abstractC17734Mo37078 instanceof C5056) {
            return (C5056) abstractC17734Mo37078;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m41532() {
        C14838.m35754(this.f58267);
        this.f58267.mo29543(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41530(C23702 c23702) {
        C14838.m35754(this.f58267);
        AbstractC17734 abstractC17734 = this.f58267;
        abstractC17734.getClass();
        C14838.m35757(this.f58267 == abstractC17734);
        AbstractC17734 abstractC17735 = c23702.f58267;
        if (abstractC17735 != null) {
            abstractC17735.mo29543(c23702);
        }
        int i = this.f58268;
        abstractC17734.mo37075().set(i, c23702);
        c23702.f58267 = abstractC17734;
        c23702.f58268 = i;
        this.f58267 = null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo29543(AbstractC17734 abstractC17734) {
        C14838.m35757(abstractC17734.f58267 == this);
        int i = abstractC17734.f58268;
        mo37075().remove(i);
        m41523(i);
        abstractC17734.f58267 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41529(int i, AbstractC17734... abstractC17734Arr) {
        C14838.m35754(abstractC17734Arr);
        if (abstractC17734Arr.length == 0) {
            return;
        }
        List listMo37075 = mo37075();
        AbstractC17734 abstractC17734Mo37068 = abstractC17734Arr[0].mo37068();
        if (abstractC17734Mo37068 != null && abstractC17734Mo37068.mo9543() == abstractC17734Arr.length) {
            List listMo37076 = abstractC17734Mo37068.mo37075();
            int length = abstractC17734Arr.length;
            while (true) {
                int i2 = length - 1;
                if (length > 0) {
                    if (abstractC17734Arr[i2] != listMo37076.get(i2)) {
                        break;
                    } else {
                        length = i2;
                    }
                } else {
                    boolean z = mo9543() == 0;
                    abstractC17734Mo37068.mo9544();
                    listMo37075.addAll(i, Arrays.asList(abstractC17734Arr));
                    int length2 = abstractC17734Arr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        abstractC17734Arr[i3].f58267 = this;
                        length2 = i3;
                    }
                    if (z && abstractC17734Arr[0].f58268 == 0) {
                        return;
                    }
                    m41523(i);
                    return;
                }
            }
        }
        for (AbstractC17734 abstractC17734 : abstractC17734Arr) {
            if (abstractC17734 == null) {
                throw new C21552("Array must not contain any null objects");
            }
        }
        for (AbstractC17734 abstractC17735 : abstractC17734Arr) {
            abstractC17735.getClass();
            AbstractC17734 abstractC17736 = abstractC17735.f58267;
            if (abstractC17736 != null) {
                abstractC17736.mo29543(abstractC17735);
            }
            abstractC17735.f58267 = this;
        }
        listMo37075.addAll(i, Arrays.asList(abstractC17734Arr));
        m41523(i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m41523(int i) {
        int iMo9543 = mo9543();
        if (iMo9543 == 0) {
            return;
        }
        List listMo37075 = mo37075();
        while (i < iMo9543) {
            ((AbstractC17734) listMo37075.get(i)).f58268 = i;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List m41525() {
        AbstractC17734 abstractC17734 = this.f58267;
        if (abstractC17734 == null) {
            return Collections.EMPTY_LIST;
        }
        List<AbstractC17734> listMo37075 = abstractC17734.mo37075();
        ArrayList arrayList = new ArrayList(listMo37075.size() - 1);
        for (AbstractC17734 abstractC17735 : listMo37075) {
            if (abstractC17735 != this) {
                arrayList.add(abstractC17735);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC17734 m41541() {
        AbstractC17734 abstractC17734 = this.f58267;
        if (abstractC17734 == null) {
            return null;
        }
        List listMo37075 = abstractC17734.mo37075();
        int i = this.f58268 + 1;
        if (listMo37075.size() > i) {
            return (AbstractC17734) listMo37075.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m41540() {
        return this.f58268;
    }

    /* JADX INFO: renamed from: ܽ */
    public String mo15298() {
        StringBuilder sbM2898 = C0669.m2898();
        C5056 c5056M41533 = m41533();
        if (c5056M41533 == null) {
            c5056M41533 = new C5056("");
        }
        C18723.m43536(new C16988(sbM2898, c5056M41533.m15300()), this);
        return C0669.m2896(sbM2898);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20718 m41537() {
        return C20718.m47383(this, true);
    }

    public String toString() {
        return mo15298();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m41524(Appendable appendable, int i, C7381 c7381) {
        appendable.append('\n');
        c7381.getClass();
        appendable.append(C0669.m2894(c7381.m20281() * i, c7381.m20283()));
    }

    @Override // 
    /* JADX INFO: renamed from: clone */
    public AbstractC17734 mo5153clone() {
        AbstractC17734 abstractC17734Mo37070 = mo37070((AbstractC17734) null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(abstractC17734Mo37070);
        while (!linkedList.isEmpty()) {
            AbstractC17734 abstractC17734 = (AbstractC17734) linkedList.remove();
            int iMo9543 = abstractC17734.mo9543();
            for (int i = 0; i < iMo9543; i++) {
                List listMo37075 = abstractC17734.mo37075();
                AbstractC17734 abstractC17734Mo37071 = ((AbstractC17734) listMo37075.get(i)).mo37070(abstractC17734);
                listMo37075.set(i, abstractC17734Mo37071);
                linkedList.add(abstractC17734Mo37071);
            }
        }
        return abstractC17734Mo37070;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC17734 mo37070(AbstractC17734 abstractC17734) {
        C5056 c5056M41533;
        try {
            AbstractC17734 abstractC17735 = (AbstractC17734) super.clone();
            abstractC17735.f58267 = abstractC17734;
            abstractC17735.f58268 = abstractC17734 == null ? 0 : this.f58268;
            if (abstractC17734 == null && !(this instanceof C5056) && (c5056M41533 = m41533()) != null) {
                C5056 c5056M15299 = c5056M41533.m15299();
                abstractC17735.f58267 = c5056M15299;
                c5056M15299.mo37075().add(abstractC17735);
            }
            return abstractC17735;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
