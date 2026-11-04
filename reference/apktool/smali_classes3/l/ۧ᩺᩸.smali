.class public final synthetic Ll/ۧ᩺᩸;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Landroid/graphics/Point;

.field public final synthetic ۟:Landroid/graphics/Point;

.field public final synthetic ܰ:Ll/۟ܰ᩸;

.field public final synthetic ܿ:I

.field public final synthetic ᩳ:Ll/ۜۗ᩸;

.field public final synthetic ᩶:Z


# direct methods
.method public synthetic constructor <init>(Ll/۟ܰ᩸;ZILandroid/graphics/Point;Landroid/graphics/Point;Ll/ۜۗ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ᩺᩸;->ܰ:Ll/۟ܰ᩸;

    iput-boolean p2, p0, Ll/ۧ᩺᩸;->᩶:Z

    iput p3, p0, Ll/ۧ᩺᩸;->ܿ:I

    iput-object p4, p0, Ll/ۧ᩺᩸;->֡:Landroid/graphics/Point;

    iput-object p5, p0, Ll/ۧ᩺᩸;->۟:Landroid/graphics/Point;

    iput-object p6, p0, Ll/ۧ᩺᩸;->ᩳ:Ll/ۜۗ᩸;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 2
    iget-object v4, p0, Ll/ۧ᩺᩸;->۟:Landroid/graphics/Point;

    .line 4
    iget-object v5, p0, Ll/ۧ᩺᩸;->ᩳ:Ll/ۜۗ᩸;

    .line 500
    iget-object v0, p0, Ll/ۧ᩺᩸;->ܰ:Ll/۟ܰ᩸;

    iget-boolean v1, p0, Ll/ۧ᩺᩸;->᩶:Z

    iget v2, p0, Ll/ۧ᩺᩸;->ܿ:I

    iget-object v3, p0, Ll/ۧ᩺᩸;->֡:Landroid/graphics/Point;

    invoke-virtual/range {v0 .. v5}, Ll/۟ܰ᩸;->ۙ(ZILandroid/graphics/Point;Landroid/graphics/Point;Ll/ۜۗ᩸;)V

    return-void
.end method
