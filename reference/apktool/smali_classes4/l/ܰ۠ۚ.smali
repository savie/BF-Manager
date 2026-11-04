.class public final synthetic Ll/ܰ۠ۚ;
.super Ljava/lang/Object;
.source "K6IS"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Landroid/widget/ScrollView;

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ScrollView;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ۠ۚ;->ܰ:Landroid/widget/ScrollView;

    iput p2, p0, Ll/ܰ۠ۚ;->᩶:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget v0, p0, Ll/ܰ۠ۚ;->᩶:I

    const/4 v1, 0x0

    .line 87
    iget-object v2, p0, Ll/ܰ۠ۚ;->ܰ:Landroid/widget/ScrollView;

    invoke-virtual {v2, v1, v0}, Landroid/widget/ScrollView;->scrollTo(II)V

    return-void
.end method
