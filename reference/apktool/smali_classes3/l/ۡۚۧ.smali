.class public final synthetic Ll/ۡۚۧ;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:[Z

.field public final synthetic ᩶:Landroid/widget/ListView;


# direct methods
.method public synthetic constructor <init>([ZLandroid/widget/ListView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۚۧ;->ܰ:[Z

    iput-object p2, p0, Ll/ۡۚۧ;->᩶:Landroid/widget/ListView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    sget p1, Ll/֨֫ۧ;->ۡ᩷:I

    const/4 p1, 0x0

    .line 1521
    :goto_0
    iget-object v0, p0, Ll/ۡۚۧ;->ܰ:[Z

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 1522
    aget-boolean v1, v0, p1

    xor-int/lit8 v1, v1, 0x1

    aput-boolean v1, v0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 1524
    :cond_0
    iget-object p1, p0, Ll/ۡۚۧ;->᩶:Landroid/widget/ListView;

    invoke-virtual {p1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object p1

    check-cast p1, Landroid/widget/BaseAdapter;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
