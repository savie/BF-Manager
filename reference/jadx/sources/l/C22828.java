package l;

import android.view.ViewGroup;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸۬۫, reason: contains not printable characters */
/* JADX INFO: compiled from: JAK2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22828 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f73983;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f73984;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C8614 f73985;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C15102 f73986;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f73987;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f73988;

    public C22828(C8614 c8614, List list) {
        this.f73985 = c8614;
        this.f73986 = (C15102) c8614.m23213();
        this.f73984 = list;
        boolean z = false;
        this.f73988 = list.size() > 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            if (interfaceC2386.isDirectory() && !interfaceC2386.mo8107()) {
                z = true;
                break;
            }
        }
        this.f73983 = z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51480(RunnableC1945 runnableC1945) {
        List list = this.f73984;
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        C15102 c15102 = this.f73986;
        String strM36371 = c15102.m36371();
        AbstractC22044 abstractC22044M35193 = C14584.m35193(strM36371, new String[0]);
        this.f73987 = abstractC22044M35193;
        boolean zMo4303 = abstractC22044M35193.mo4303();
        int i = 1;
        C8614 c8614 = this.f73985;
        if (zMo4303) {
            AbstractC22044 abstractC22044M49858 = this.f73987.m49858();
            C17359.requireNonNull(abstractC22044M49858);
            if (!abstractC22044M49858.mo4303()) {
                if (!C7756.m21096()) {
                    c8614.m23233().m40400(C21576.m49059(R.string.MT_Protector, strM36371), false);
                    return;
                }
            }
        } else if (!C7756.m21096()) {
            c8614.m23233().m40400(C21576.m49059(R.string.MT_Protector, strM36371), false);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) c8614.m23233().m40395(R.layout.MT_Protector);
        CheckBox checkBox = (CheckBox) viewGroup.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewGroup.findViewById(R.id.MT_Protector);
        checkBox.setChecked(true);
        checkBox2.setVisibility(8);
        boolean zM36369 = c15102.m36369();
        String strM50718 = C22482.m50718(this.f73988 ? System.currentTimeMillis() : ((C2494) list.get(0)).getTime());
        C6969 c6969 = new C6969(this, c8614.m23233(), zM36369, checkBox, viewGroup, zM36369 ? C18685.m43474(this.f73987) : null, runnableC1945);
        c6969.m22945(R.string.MT_Protector);
        c6969.m22924((CharSequence) strM50718);
        c6969.m22933(C22482.m50712());
        c6969.m22918();
        c6969.m22957(6);
        c6969.m22948(4);
        c6969.m22923(new C4863(true));
        c6969.m22955(true);
        c6969.m22928().setOnClickListener(new ViewOnClickListenerC5325(c6969, i));
        C5416.m16144(c6969.m22956());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51474(C22828 c22828, RunnableC1945 runnableC1945, long j, boolean z, C9651 c9651, boolean z2) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        for (InterfaceC2386 interfaceC2386 : c22828.f73984) {
            String strSubstring = interfaceC2386.getPath().substring(1);
            if (interfaceC2386.isDirectory()) {
                arrayList.add(strSubstring + "/");
            } else {
                hashSet.add(strSubstring);
            }
        }
        new C10893(c22828, c9651, z2, hashSet, arrayList, z, j, hashSet2, runnableC1945).m8197();
    }
}
