.class public final Ll/ܰۚ᩻;
.super Ljava/lang/Object;
.source "F6QC"


# instance fields
.field public ֡:Z

.field public ֫:I

.field public ۗ:I

.field public ۘ:Z

.field public final ۙ:Ljava/util/ArrayList;

.field public ۚ:Z

.field public final ۛ:I

.field public ۤ:Z

.field public ۧ:Ljava/lang/String;

.field public ۨ:Z

.field public ۫:Ll/ܰۚ᩻;

.field public final ܰ:I

.field public ܳ:Z

.field public ܶ:Z

.field public ܺ:Ljava/lang/String;

.field public ܽ:Ll/ܰۚ᩻;

.field public final ܿ:Ljava/util/HashMap;

.field public ᩴ:I

.field public ᩵:Z

.field public ᩶:Z

.field public ᩷:I

.field public ᩸:Z

.field public ᩹:Z

.field public final ᩺:I

.field public ᩻:Ll/ܰۚ᩻;


# direct methods
.method public constructor <init>(III)V
    .locals 1

    .line 550
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 528
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰۚ᩻;->ۙ:Ljava/util/ArrayList;

    .line 529
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܰۚ᩻;->ܿ:Ljava/util/HashMap;

    .line 550
    iput p1, p0, Ll/ܰۚ᩻;->ۛ:I

    iput p2, p0, Ll/ܰۚ᩻;->᩺:I

    iput p3, p0, Ll/ܰۚ᩻;->ܰ:I

    return-void
.end method
