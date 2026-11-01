package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: l.۬۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC13125 extends AbstractActivityC12483 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f43708 = 0;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public static String f43709;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC0424 f43710;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C5938 f43711;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC20886 f43712;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public C1129 f43713;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public ListView f43714;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "ArscEditor";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f43713 = (C1129) new C16717(this).m39205(C1129.class);
        C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C1484 c1484 = new C1484(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m34905(c1484);
        m31023();
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        this.f41645 = (C6938) m31016(R.id.MT_Protector);
        ListView listView = (ListView) m31016(android.R.id.list);
        this.f43714 = listView;
        listView.setFastScrollEnabled(true);
        m31004(this.f41645);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC20535(0, this));
        this.f43712 = new ViewOnClickListenerC20886(this);
        this.f43710 = new ViewOnClickListenerC0424(this);
        if (this.f43713.f5086) {
            m32479();
        } else {
            if (C5553.m15320((AbstractActivityC12483) this)) {
                return;
            }
            new C9247(this).m10243();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public void m32479() {
        C18418 c18418 = new C18418(this);
        ListView listView = this.f43714;
        C5938 c5938 = new C5938(c18418);
        this.f43711 = c5938;
        listView.setAdapter((ListAdapter) c5938);
        this.f43714.setOnScrollListener(new C2895(this));
        this.f43711.m38885(this.f43714);
        this.f43711.m30532(true);
        this.f43711.m30530();
        this.f43714.setOnItemClickListener(this);
        this.f43714.setOnItemLongClickListener(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        switch (C14186.f46539[this.f43713.m4162().ordinal()]) {
            case 1:
            case 2:
            case 3:
                C1129 c1129 = this.f43713;
                if (c1129.f5095) {
                    i = c1129.f5076[i];
                }
                c1129.f5088 = c1129.f5085.getValue(i);
                C16195 c16195 = new C16195(this, view, 0);
                c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c16195.m38296(new InterfaceC21133() { // from class: l.ۤ֨ۖ
                    @Override // l.InterfaceC21133
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i2 = ActivityC13125.f43708;
                        if (menuItem.getItemId() == R.string.MT_Protector) {
                            final ActivityC13125 activityC13125 = this.f34015;
                            C1129 c11210 = activityC13125.f43713;
                            String strM16375 = c11210.f5097.m16375(c11210.f5088.mo25193());
                            int i3 = DialogInterfaceC19356.f62401;
                            C8067 c8067 = new C8067(activityC13125);
                            c8067.m21274(R.string.MT_Protector);
                            c8067.m21261(activityC13125.getString(R.string.MT_Protector, strM16375));
                            final int i4 = i;
                            c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵֨ۖ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    ActivityC13125 activityC13126 = activityC13125;
                                    activityC13126.f43713.f5085.m42944(i4);
                                    activityC13126.f43713.f5088 = null;
                                    activityC13126.f43711.notifyDataSetChanged();
                                    activityC13126.f43713.f5074 = true;
                                }
                            });
                            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c8067.m21269();
                        }
                        return true;
                    }
                });
                C2766.m8440(view, c16195);
                return true;
            case 4:
            default:
                return false;
            case 5:
            case 8:
            case 9:
                final EnumC16653 enumC16653M4162 = this.f43713.m4162();
                if (enumC16653M4162 == EnumC16653.CONFIG) {
                    C1129 c11210 = this.f43713;
                    c11210.f5085 = (C18551) c11210.f5082.get(c11210.f5073 ? c11210.f5084[i] : i);
                } else if (enumC16653M4162 == EnumC16653.SEARCH_BY_ID) {
                    m32483((C18551) this.f43713.f5096.get(i));
                } else if (enumC16653M4162 == EnumC16653.SEARCH_VALUE) {
                    m32483(((C8892) this.f43713.f5081.get(i)).f30480);
                } else {
                    throw new IllegalStateException(enumC16653M4162.name());
                }
                C16195 c16196 = new C16195(this, view, 0);
                if (enumC16653M4162 != EnumC16653.SEARCH_BY_ID) {
                    c16196.m38298().add(0, R.string.menu_copy_id, 0, R.string.menu_copy_id);
                }
                c16196.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c16196.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c16196.m38296(new InterfaceC21133() { // from class: l.۠֨ۖ
                    @Override // l.InterfaceC21133
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i2 = ActivityC13125.f43708;
                        int itemId = menuItem.getItemId();
                        final ActivityC13125 activityC13125 = this.f25781;
                        if (itemId == R.string.menu_copy_id) {
                            C16737.m39266(R.string.MT_Protector, activityC13125.f43713.f5085.mo10694());
                        } else if (itemId == R.string.MT_Protector) {
                            activityC13125.f43712.m46937();
                        } else if (itemId == R.string.MT_Protector) {
                            int i3 = DialogInterfaceC19356.f62401;
                            C8067 c8067 = new C8067(activityC13125);
                            c8067.m21274(R.string.MT_Protector);
                            c8067.m21261(activityC13125.getString(R.string.MT_Protector, activityC13125.f43713.f5085.mo7645()));
                            final EnumC16653 enumC16653 = enumC16653M4162;
                            final int i4 = i;
                            c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡ֨ۖ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    ActivityC13125 activityC13126 = activityC13125;
                                    C1129 c11211 = activityC13126.f43713;
                                    c11211.f5090.m47901(c11211.f5085.mo10691());
                                    EnumC16653 enumC16654 = EnumC16653.CONFIG;
                                    EnumC16653 enumC16655 = enumC16653;
                                    int i6 = i4;
                                    if (enumC16655 == enumC16654) {
                                        C1129 c11212 = activityC13126.f43713;
                                        if (c11212.f5073) {
                                            c11212.f5075--;
                                            while (true) {
                                                C1129 c11213 = activityC13126.f43713;
                                                if (i6 >= c11213.f5075) {
                                                    break;
                                                }
                                                int[] iArr = c11213.f5084;
                                                int i7 = i6 + 1;
                                                iArr[i6] = iArr[i7] - 1;
                                                i6 = i7;
                                            }
                                        }
                                        activityC13126.f43713.m4163();
                                    } else if (enumC16655 == EnumC16653.SEARCH_BY_ID) {
                                        activityC13126.f43713.f5096.remove(i6);
                                    } else if (enumC16655 == EnumC16653.SEARCH_VALUE) {
                                        activityC13126.f43713.f5081.remove(i6);
                                    } else {
                                        throw new IllegalStateException(enumC16655.name());
                                    }
                                    activityC13126.f43713.f5085 = null;
                                    activityC13126.f43711.notifyDataSetChanged();
                                    activityC13126.f43713.f5074 = true;
                                }
                            });
                            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c8067.m21269();
                        }
                        return true;
                    }
                });
                C2766.m8440(view, c16196);
                return true;
            case 6:
                if (i >= 3) {
                    C1129 c11211 = this.f43713;
                    c11211.f5080 = c11211.f5091.mo5140(i - 3);
                    C13831 c13831 = new C13831(this, this);
                    c13831.m40376(R.string.MT_Protector);
                    c13831.m40346((CharSequence) this.f43713.f5080.getPackageName());
                    c13831.m40336(6);
                    c13831.m40355();
                    c13831.m40368(true);
                    return true;
                }
                return false;
            case 7:
                C1129 c11212 = this.f43713;
                c11212.f5090 = c11212.f5083.mo1530(i);
                this.f43713.m4163();
                C16195 c16197 = new C16195(this, view, 0);
                c16197.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                if (this.f43713.f5083.mo1536() > 1) {
                    c16197.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                c16197.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c16197.m38296(new InterfaceC21133() { // from class: l.ܺ֨ۖ
                    @Override // l.InterfaceC21133
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i2 = ActivityC13125.f43708;
                        int itemId = menuItem.getItemId();
                        final ActivityC13125 activityC13125 = this.f50723;
                        if (itemId == R.string.MT_Protector) {
                            C11714 c11714 = new C11714(activityC13125, activityC13125);
                            c11714.m40376(R.string.MT_Protector);
                            c11714.m40346((CharSequence) activityC13125.f43713.f5090.mo31757());
                            c11714.m40340();
                            c11714.m40336(6);
                            c11714.m40355();
                            c11714.m40368(true);
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            int i3 = DialogInterfaceC19356.f62401;
                            C8067 c8067 = new C8067(activityC13125);
                            c8067.m21274(R.string.MT_Protector);
                            c8067.m21261(activityC13125.getString(R.string.MT_Protector, activityC13125.f43713.f5090.mo31755()));
                            final int i4 = i;
                            c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿ֨ۖ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    ActivityC13125 activityC13126 = activityC13125;
                                    activityC13126.f43713.f5083.m1517(i4);
                                    C1129 c11213 = activityC13126.f43713;
                                    c11213.f5090 = null;
                                    c11213.f5082.clear();
                                    activityC13126.f43711.notifyDataSetChanged();
                                    activityC13126.f43713.f5074 = true;
                                }
                            });
                            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c8067.m21269();
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            C2540 c2540 = new C2540(activityC13125, activityC13125);
                            c2540.m40376(R.string.MT_Protector);
                            c2540.m40346((CharSequence) activityC13125.f43713.f5090.mo31757());
                            c2540.m40340();
                            c2540.m40336(6);
                            c2540.m40371();
                            c2540.m40368(true);
                        }
                        return true;
                    }
                });
                C2766.m8440(view, c16197);
                return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32483(C18551 c18551) {
        C1129 c1129 = this.f43713;
        c1129.f5085 = c18551;
        c1129.f5090 = c18551.mo10690();
        C1129 c11210 = this.f43713;
        c11210.f5083 = c11210.f5090.getType();
        C1129 c11211 = this.f43713;
        c11211.f5080 = c11211.f5083.m1543();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (C14186.f46539[this.f43713.m4162().ordinal()]) {
            case 1:
            case 2:
            case 3:
                C1129 c1129 = this.f43713;
                if (c1129.f5095) {
                    i = c1129.f5076[i];
                }
                c1129.f5088 = c1129.f5085.getValue(i);
                this.f43710.m2215();
                break;
            case 4:
                C5363 c5363 = new C5363(this, this);
                c5363.m40376(R.string.MT_Protector);
                c5363.m40369();
                C1129 c11210 = this.f43713;
                C17140 c17140 = c11210.f5092;
                if (c11210.f5073) {
                    i = c11210.f5084[i];
                }
                c11210.f5094 = i;
                c5363.m40346((CharSequence) c17140.m10939(i));
                c5363.m40371();
                c5363.m40368(true);
                break;
            case 5:
                if (!this.f43713.f5083.getTypeName().equals("id")) {
                    C1129 c11211 = this.f43713;
                    ArrayList arrayList = c11211.f5082;
                    if (c11211.f5073) {
                        i = c11211.f5084[i];
                    }
                    c11211.f5085 = (C18551) arrayList.get(i);
                    if (this.f43713.f5085.mo7644()) {
                        setTitle(this.f43713.f5090.mo31755() + '/' + this.f43713.f5085.mo7645());
                        m32482(EnumC16653.ENTRY);
                    } else {
                        C1129 c11212 = this.f43713;
                        c11212.f5088 = c11212.f5085.getValue();
                        this.f43710.m2215();
                    }
                }
                break;
            case 6:
                if (i == 0) {
                    m31016(R.string.MT_Protector);
                    m32482(EnumC16653.STRING_POOL);
                } else if (i == 1) {
                    new C22297(this, this).m40656();
                } else if (i != 2) {
                    C1129 c11213 = this.f43713;
                    c11213.f5080 = c11213.f5091.mo5140(i - 3);
                    setTitle(this.f43713.f5080.getPackageName());
                    m32482(EnumC16653.PACKAGE);
                } else {
                    C5718 c5718 = new C5718(this, this);
                    c5718.m40376(R.string.search_by_id);
                    c5718.m40346((CharSequence) f43709);
                    c5718.m40340();
                    c5718.m40336(3);
                    String str = f43709;
                    if (str != null && str.length() > 0) {
                        c5718.m40355();
                    }
                    c5718.m40368(true);
                }
                break;
            case 7:
                C1129 c11214 = this.f43713;
                c11214.f5090 = c11214.f5083.mo1530(i);
                this.f43713.m4163();
                setTitle(this.f43713.f5090.mo31755());
                m32482(EnumC16653.CONFIG);
                break;
            case 8:
                C1129 c11215 = this.f43713;
                c11215.f5085 = (C18551) c11215.f5096.get(i);
                if (this.f43713.f5085.mo7644()) {
                    C1129 c11216 = this.f43713;
                    c11216.f5090 = c11216.f5085.mo10690();
                    this.f43713.m4163();
                    C1129 c11217 = this.f43713;
                    c11217.f5083 = c11217.f5090.getType();
                    setTitle(this.f43713.f5090.mo31755() + '/' + this.f43713.f5085.mo7645());
                    m32482(EnumC16653.SEARCH_BY_ID_IN);
                } else {
                    C1129 c11218 = this.f43713;
                    c11218.f5088 = c11218.f5085.getValue();
                    this.f43710.m2215();
                }
                break;
            case 9:
                m32483(((C8892) this.f43713.f5081.get(i)).f30480);
                if (this.f43713.f5085.mo7644()) {
                    setTitle(this.f43713.f5090.mo31755() + "/" + this.f43713.f5085.mo7645());
                    m32482(EnumC16653.SEARCH_VALUE_IN);
                } else {
                    C1129 c11219 = this.f43713;
                    c11219.f5088 = c11219.f5085.getValue();
                    this.f43710.m2215();
                }
                break;
            case 10:
                C1129 c11220 = this.f43713;
                c11220.f5083 = c11220.f5080.getType(i);
                if (this.f43713.f5083.mo1536() == 1 && this.f43713.f5083.getTypeName().equals("id")) {
                    C1129 c11221 = this.f43713;
                    c11221.f5090 = c11221.f5083.mo1530(0);
                    this.f43713.m4163();
                    setTitle(this.f43713.f5090.mo31755());
                    m32482(EnumC16653.CONFIG);
                } else {
                    setTitle(this.f43713.f5083.getTypeName());
                    m32482(EnumC16653.TYPE);
                }
                break;
        }
    }

    @Override // l.ActivityC4866
    /* JADX INFO: renamed from: ᩴ */
    public final void mo10632() {
        m32484();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m32484() {
        if (this.f43713.f5074) {
            int i = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(this);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21253(R.string.MT_Protector);
            c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽ֨ۖ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ActivityC13125.f43708;
                    new C10658(this.f52503, true).m10243();
                }
            });
            c8067.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC12069(0, this));
            c8067.m21269();
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m32478() {
        C1129 c1129 = this.f43713;
        C7262 c7262 = c1129.f5080;
        C0206 c0206 = c1129.f5083;
        C21373 c21373 = c1129.f5090;
        C18551 c18551 = c1129.f5085;
        switch (C14186.f46539[c1129.m4162().ordinal()]) {
            case 1:
                C1129 c11210 = this.f43713;
                if (c11210.f5095) {
                    c11210.f5095 = false;
                    this.f43711.notifyDataSetChanged();
                    setTitle(c21373.mo31755() + '/' + c18551.mo7645());
                } else {
                    setTitle(c11210.f5073 ? getString(R.string.MT_Protector, c11210.f5079) : c21373.mo31755());
                    m32482(EnumC16653.CONFIG);
                }
                break;
            case 2:
                C1129 c11211 = this.f43713;
                if (c11211.f5095) {
                    c11211.f5095 = false;
                    this.f43711.notifyDataSetChanged();
                    setTitle(c21373.mo31755() + '/' + c18551.mo7645());
                } else {
                    setTitle(f43709);
                    m32482(EnumC16653.SEARCH_BY_ID);
                }
                break;
            case 3:
                C1129 c11212 = this.f43713;
                if (c11212.f5095) {
                    c11212.f5095 = false;
                    this.f43711.notifyDataSetChanged();
                    setTitle(c21373.mo31755() + "/" + c18551.mo7645());
                } else {
                    setTitle(c11212.f5089);
                    m32482(EnumC16653.SEARCH_VALUE);
                }
                break;
            case 4:
                C1129 c11213 = this.f43713;
                if (c11213.f5073) {
                    c11213.f5073 = false;
                    this.f43711.notifyDataSetChanged();
                    m31016(R.string.MT_Protector);
                } else {
                    m31016(R.string.MT_Protector);
                    m32482(EnumC16653.MAIN);
                }
                break;
            case 5:
                C1129 c11214 = this.f43713;
                if (c11214.f5073) {
                    c11214.f5073 = false;
                    this.f43711.notifyDataSetChanged();
                    setTitle(c21373.mo31755());
                } else if (c0206.mo1536() == 1 && c0206.getTypeName().equals("id")) {
                    setTitle(c7262.getPackageName());
                    m32482(EnumC16653.PACKAGE);
                } else {
                    setTitle(c0206.getTypeName());
                    m32482(EnumC16653.TYPE);
                }
                break;
            case 6:
                m32484();
                break;
            case 7:
                setTitle(c7262.getPackageName());
                m32482(EnumC16653.PACKAGE);
                break;
            case 8:
            case 9:
                this.f43713.f5081.clear();
                this.f43713.f5096.clear();
                m31016(R.string.MT_Protector);
                m32482(EnumC16653.MAIN);
                break;
            case 10:
                m31016(R.string.MT_Protector);
                m32482(EnumC16653.MAIN);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x0165  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        int itemId = menuItem.getItemId();
        int iMo7647 = 0;
        if (itemId == R.id.MT_Protector) {
            new C10658(this, false).m10243();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m32484();
            return true;
        }
        byte b = 2;
        if (itemId == R.id.MT_Protector) {
            int i = C14186.f46539[this.f43713.m4162().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                z = this.f43713.f5095;
            } else {
                z = this.f43713.f5073;
            }
            new C4657(this, this, z).m15185();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            final C0206 c0206 = this.f43713.f5083;
            int iMo1536 = c0206.mo1536();
            String[] strArr = new String[iMo1536];
            final boolean[] zArr = new boolean[iMo1536];
            while (iMo7647 < iMo1536) {
                strArr[iMo7647] = c0206.mo1530(iMo7647).mo31755();
                iMo7647++;
            }
            View viewM30995 = m30995(R.layout.MT_Protector);
            ListView listView = (ListView) viewM30995.findViewById(R.id.MT_Protector);
            C16754.m39314(listView);
            listView.setDivider(null);
            ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
            final C0525 c0525 = new C0525(this, zArr, strArr);
            listView.setAdapter((ListAdapter) c0525);
            listView.setOnItemClickListener(c0525);
            int i2 = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(this);
            c8067.m21258(viewM30995);
            c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶֨ۖ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    int i4 = ActivityC13125.f43708;
                    ActivityC13125 activityC13125 = this.f63646;
                    activityC13125.getClass();
                    boolean[] zArr2 = zArr;
                    boolean z2 = false;
                    for (int length = zArr2.length - 1; length >= 0; length--) {
                        if (zArr2[length]) {
                            c0206.m1517(length);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        activityC13125.f43711.notifyDataSetChanged();
                        activityC13125.f43713.f5074 = true;
                    }
                }
            });
            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067.m21269().m44361().setOnClickListener(new View.OnClickListener() { // from class: l.֡֨ۖ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = ActivityC13125.f43708;
                    int i4 = 0;
                    while (true) {
                        boolean[] zArr2 = zArr;
                        if (i4 >= zArr2.length) {
                            c0525.notifyDataSetChanged();
                            return;
                        } else {
                            zArr2[i4] = !zArr2[i4];
                            i4++;
                        }
                    }
                }
            });
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C23358(this, this);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        int i3 = C14186.f46539[this.f43713.m4162().ordinal()];
        if (i3 != 1) {
            if (i3 == 5) {
                C19475.m44534(this);
                return true;
            }
            if (i3 != 7) {
                return true;
            }
            C18769 c18769 = new C18769(this, this);
            c18769.m40376(R.string.MT_Protector);
            Locale locale = Locale.getDefault();
            c18769.m40367("-" + locale.getLanguage() + "-r" + locale.getCountry());
            c18769.m40340();
            c18769.m40336(6);
            c18769.m40368(true);
            return true;
        }
        String typeName = this.f43713.f5083.getTypeName();
        typeName.getClass();
        switch (typeName.hashCode()) {
            case -475309713:
                if (!typeName.equals("plurals")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 3004913:
                if (!typeName.equals("attr")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 93090393:
                if (!typeName.equals("array")) {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        String str = "Text";
        int i4 = 4;
        switch (b) {
            case 0:
                i4 = 0;
                break;
            case 1:
                iMo7647 = 16777216;
                str = "1";
                break;
            case 2:
                iMo7647 = 33554432 + this.f43713.f5085.mo7647();
                i4 = 0;
                break;
            default:
                str = "1";
                break;
        }
        this.f43710.m2216(str, iMo7647, i4, true);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        SubMenu subMenu = menu.findItem(R.id.more).getSubMenu();
        C13638.requireNonNull(subMenu);
        final MenuItem menuItemFindItem = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem2 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem3 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem4 = subMenu.findItem(R.id.MT_Protector);
        this.f43713.f5093.m44959(this, new InterfaceC10597() { // from class: l.۟֨ۖ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                EnumC16653 enumC16653 = (EnumC16653) obj;
                int i = ActivityC13125.f43708;
                EnumC16653 enumC16654 = EnumC16653.STRING_POOL;
                menuItemFindItem2.setVisible(enumC16653 == enumC16654);
                menuItemFindItem.setVisible(enumC16653 == enumC16654 || enumC16653 == EnumC16653.CONFIG || enumC16653 == EnumC16653.ENTRY || enumC16653 == EnumC16653.SEARCH_VALUE_IN || enumC16653 == EnumC16653.SEARCH_BY_ID_IN);
                EnumC16653 enumC16655 = EnumC16653.TYPE;
                menuItemFindItem3.setVisible(enumC16653 == enumC16655 || enumC16653 == EnumC16653.CONFIG || enumC16653 == EnumC16653.ENTRY);
                menuItemFindItem4.setVisible(enumC16653 == enumC16655);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m32482(EnumC16653 enumC16653) {
        EnumC16653 enumC16653M4162 = this.f43713.m4162();
        this.f43713.f5077[enumC16653M4162.ordinal()] = this.f43714.getFirstVisiblePosition();
        this.f43713.f5093.mo23642(enumC16653);
        this.f43711.m30532(true);
        this.f43711.m30530();
        this.f43711.notifyDataSetChanged();
        if (enumC16653M4162 == EnumC16653.SEARCH_VALUE || enumC16653M4162 == EnumC16653.SEARCH_VALUE_IN || enumC16653M4162 == EnumC16653.SEARCH_BY_ID || enumC16653M4162 == EnumC16653.SEARCH_BY_ID_IN) {
            return;
        }
        this.f43714.setSelection(this.f43713.f5077[enumC16653.ordinal()]);
    }
}
