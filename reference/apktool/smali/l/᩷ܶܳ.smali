.class public final synthetic Ll/᩷ܶܳ;
.super Ljava/lang/Object;
.source "W6DR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/ۤܶܳ;

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(Ll/ۤܶܳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ܶܳ;->ܰ:Ll/ۤܶܳ;

    iput p2, p0, Ll/᩷ܶܳ;->᩶:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 336
    iget-object v0, p0, Ll/᩷ܶܳ;->ܰ:Ll/ۤܶܳ;

    iget-object v1, v0, Ll/ۤܶܳ;->ܰ:Ll/֫ܶܳ;

    invoke-static {v1}, Ll/֫ܶܳ;->ᩴ(Ll/֫ܶܳ;)Ll/᩹᩹ܳ;

    move-result-object v1

    iget v2, p0, Ll/᩷ܶܳ;->᩶:I

    invoke-virtual {v1, v2}, Ll/᩹᩹ܳ;->᩸(I)V

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
